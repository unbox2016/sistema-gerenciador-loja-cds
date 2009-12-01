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
            String ins = "INSERT INTO administrador VALUES(?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setString(1, adm.getLogin());
            stm.setString(2, adm.getNome());
            stm.setString(3, adm.getSenha());
            stm.setString(4, adm.getCpf());
            stm.setString(5, adm.getRg());
            stm.setDate(6,(Date) adm.getDNascimento());
            stm.setString(7, adm.getSexo());
            stm.setString(8, adm.getTelefone());
            stm.setString(9, adm.getLogin());
            stm.setBoolean(10, adm.isIsAdm());
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }

    }
}
