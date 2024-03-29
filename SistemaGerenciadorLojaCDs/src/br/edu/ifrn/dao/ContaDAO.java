/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.CD;
import br.edu.ifrn.dominio.Conta;
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
public class ContaDAO {

    Connection conexao;

    public ContaDAO(){
        conexao = ConnectionFactory.getConnection();
    }

    public void addConta(Conta cont){
        try {
            
            String ins = "INSERT INTO conta VALUES(?,?);";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, cont.getCodigo());
            stm.setFloat(2, cont.getSaldoTotal());
            

            stm.executeUpdate();
            stm.close();
            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
    }

    public void updateConta(Conta cont){
        try {
            
            String ins = "UPDATE conta SET codigo=?, saldototal=? WHERE codigo=?;";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, cont.getCodigo());
            stm.setFloat(2, cont.getSaldoTotal());
            stm.setInt(3, cont.getCodigo());

            stm.executeUpdate();
            stm.close();
            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
    }

    public void deleteConta(Conta cont){
        try {
            
            String ins = "DELETE FROM conta WHERE codigo=?;";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, cont.getCodigo());

            stm.executeUpdate();
            stm.close();
            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
    }

    LinkedList<Conta> listaCon = new LinkedList();
    public LinkedList<Conta> selectConta() {
         try {
        
            String ins = "SELECT * FROM conta;";
            PreparedStatement stm = conexao.prepareStatement(ins);
            ResultSet rs = stm.executeQuery();

            CDDAO cdDAO = new CDDAO();
            LinkedList<CD> listaCD = cdDAO.selectCD();
           

            while(rs.next()){
                        Conta c = new Conta(rs.getInt(1),rs.getFloat(2));
                        listaCon.add(c);
                        break;
                    }
                
            


            rs.close();
            stm.close();
            conexao.close();

        } catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }

        return listaCon;
    }

}
