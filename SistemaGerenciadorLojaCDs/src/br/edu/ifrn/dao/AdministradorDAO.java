/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.Administrador;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 2007134010467
 */
public class AdministradorDAO {

    public AdministradorDAO(){

    }

    public void addAdministrador(Administrador adm) {
        
        try{

            Connection conexao = ConnectionFactory.getConnection();
            String ins = "INSERT INTO administrador VALUES(?);";
            PreparedStatement stm = conexao.prepareStatement(ins);
            stm.setString(1, adm.getLogin());

            FuncionarioDAO fdao = new FuncionarioDAO();
            fdao.addFuncionario(adm);
            
            stm.executeUpdate();
            conexao.close();
            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }

    }
}
