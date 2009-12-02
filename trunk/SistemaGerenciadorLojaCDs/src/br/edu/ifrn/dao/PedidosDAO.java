/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.Pedidos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author 2007134010467
 */
public class PedidosDAO {
    
    public void addPedido(Pedidos p){
        try {
            Connection conexao = ConnectionFactory.getConnection();
            String ins = "INSERT INTO pedidos VALUES(?,?,?);";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, p.getCodigo());
            stm.setString(2, p.getCli());
            stm.setString(3, p.getConteudo());

            stm.executeUpdate();
            stm.close();

            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }
    }

    public void updatePedido(Pedidos p){
         try {
            Connection conexao = ConnectionFactory.getConnection();
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
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }
    }

    public void deletePedido(Pedidos p){
         try {

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }
    }

    LinkedList<Pedidos> listaPedidos = new LinkedList();
    public LinkedList<Pedidos> selectPedido(){
         try {

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }

         return listaPedidos;
    }
}
//