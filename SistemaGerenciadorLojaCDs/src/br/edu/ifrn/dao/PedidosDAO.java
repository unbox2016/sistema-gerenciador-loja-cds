/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.Cliente;
import br.edu.ifrn.dominio.Pedidos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author 2007134010467
 */
public class PedidosDAO {

    Connection conexao;

    public PedidosDAO(){
        conexao = ConnectionFactory.getConnection();
    }

    public void addPedido(Pedidos p){
        try {
            
            String ins = "INSERT INTO pedidos VALUES(?,?,?);";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, p.getCodigo());
            stm.setString(2, p.getCli());
            stm.setString(3, p.getConteudo());

            stm.executeUpdate();
            stm.close();

            conexao.close();

        } catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
    }

    public void updatePedido(Pedidos p){
         try {
          
            String ins = "UPDATE pedidos SET codigo=?, cliente_cpf='?', conteudo='?' WHERE codigo=?;";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, p.getCodigo());
            stm.setString(2, p.getCli());
            stm.setString(3, p.getConteudo());
            stm.setInt(4, p.getCodigo());

            stm.executeUpdate();
            stm.close();

            conexao.close();

        } catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
    }

    public void deletePedido(Pedidos p){
         try {
            
            String ins = "DELETE FROM pedidos WHERE codigo=?;";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, p.getCodigo());

            stm.executeUpdate();
            stm.close();

            conexao.close();            
        } catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
    }

    
    public LinkedList<Pedidos> selectPedido(){
         LinkedList<Pedidos> listaPedidos = new LinkedList();
         try {
            
            String ins = "SELECT * FROM pedidos;";
            PreparedStatement stm = conexao.prepareStatement(ins);

            ResultSet rs = stm.executeQuery();
            
            ClienteDAO cdao = new ClienteDAO();
            LinkedList<Cliente> listaCli = cdao.selectCliente();


            while(rs.next()){
                for(Cliente cli: listaCli){
                    if(cli.getCpf().equals(rs.getString(2))){
                        Pedidos p = new Pedidos(rs.getInt(1), cli, rs.getString(2));
                        listaPedidos.add(p);
                        break; // sai do loop
                    }
                }
            }
            
             rs.close();
            stm.close();
            conexao.close();

        } catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }

         return listaPedidos;
    }
}
//