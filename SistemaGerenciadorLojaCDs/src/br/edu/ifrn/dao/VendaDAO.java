/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.CD;
import br.edu.ifrn.dominio.Cliente;
import br.edu.ifrn.dominio.Venda;
import br.edu.ifrn.dominio.Vendedor;
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
public class VendaDAO {
    Connection conexao;

    public VendaDAO(){
        conexao = ConnectionFactory.getConnection();
    }

    public void addVenda(Venda v) {
        try {
            String ins = "INSERT INTO venda VALUES(?,?,?,?);";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setString(1, v.getVend());
            stm.setString(2, v.getCli());
            stm.setInt(3, v.getCd());
            stm.setInt(4, v.getQuantCdsVendidos());

            stm.executeUpdate();
            stm.close();
            conexao.close();

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
       
    }

    
    public LinkedList<Venda> selectVenda(){
        LinkedList<Venda> listaVen = new LinkedList();
        try {

            String ins = "SELECT * FROM venda;";
            PreparedStatement stm = conexao.prepareStatement(ins);
            ResultSet rs  = stm.executeQuery();

            Cliente cli = null;
            CD cd = null;
            Vendedor vend = null;

            ClienteDAO cdao = new ClienteDAO();
            CDDAO cddao = new CDDAO();
            VendedorDAO vdao = new VendedorDAO();

            LinkedList<Cliente> listaCli = cdao.selectCliente();
            LinkedList<CD> listaCD = cddao.selectCD();
            LinkedList<Vendedor> listaVend = vdao.selectVendedor();

            while(rs.next()){

                for(Cliente cliente: listaCli){
                    if(cliente.getCpf().equals(rs.getString(2))){
                        cli =   cliente;
                        break;
                    }
                }

                for(CD disk: listaCD){
                    if(cd.getId() == rs.getInt(3)){
                        cd = disk;
                        break;
                    }
                }

                for(Vendedor v: listaVend){
                    if(vend.getLogin().equals(rs.getString(1))){
                        vend = v;

                        Venda venda = new Venda(cli,cd,vend,rs.getInt(4));
                        listaVen.add(venda);
                        
                        break;
                    }
                }
            }

        rs.close();
        stm.close();
        conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }

        return listaVen;

    }
}

