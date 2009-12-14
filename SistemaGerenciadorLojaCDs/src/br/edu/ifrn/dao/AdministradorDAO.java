/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.Administrador;
import br.edu.ifrn.dominio.Funcionario;
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
public class AdministradorDAO {

    private FuncionarioDAO fdao = new FuncionarioDAO();
    Connection conexao;

     public AdministradorDAO(){
        conexao = ConnectionFactory.getConnection();
    }

    public void addAdministrador(Administrador adm) {
        
        try{

            
            String ins = "INSERT INTO administrador VALUES(?);";
            PreparedStatement stm = conexao.prepareStatement(ins);
            stm.setString(1, adm.getLogin());

            fdao.addFuncionario(adm);
            
            stm.executeUpdate();
            stm.close();
            conexao.close();         
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }

    }

    public void updateAdministrador(Administrador adm){
        fdao.updateFuncionario(adm);

    }

    public void deleteAdministrador(Administrador adm){
        try {
            
            String ins = "DELETE FROM administrador WHERE funcionario_login='?'";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setString(1, adm.getLogin());
            fdao.deleteFuncionario(adm);

            stm.executeUpdate();
            stm.close();

            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
    }

    public LinkedList<Administrador> selectAdministrador(){
        LinkedList<Administrador> listaAdm = new LinkedList();
         try {
            
            String ins = "SELECT * FROM funcionario, administrador WHERE funcionario.login = administrador.funcionario_login;";
            PreparedStatement stm = conexao.prepareStatement(ins);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Administrador a = new Administrador(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(4), rs.getString(5), rs.getDate(6));
                listaAdm.add(a);
            }

            rs.close();
            stm.close();
            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        } finally{
             return listaAdm;
        }       

    }


}
