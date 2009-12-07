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

    LinkedList<Venda> listaVen = new LinkedList();
    public LinkedList<Venda> selectVenda(){
        try {
            

            String ins = "SELECT * FROM venda;";
            PreparedStatement stm = conexao.prepareStatement(ins);
            ResultSet rs  = stm.executeQuery();

            Cliente cli;
            CD cd;
            Vendedor vend;

            LinkedList<Cliente> listaCli = new LinkedList();
            LinkedList<CD> listaCD = new LinkedList();
            LinkedList<Vendedor> listaVend = new LinkedList();

            while(rs.next()){
                

            }


        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }

        return listaVen;

    }
}

