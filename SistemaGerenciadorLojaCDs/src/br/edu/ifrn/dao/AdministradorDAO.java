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

/**
 *
 * @author 2007134010467
 */
public class AdministradorDAO {

    public AdministradorDAO(){

    }

    public void addAdministrador(Administrador adm) {

        Connection conexao = ConnectionFactory.getConnection();
        String instrucao = "INSERT INTO administrador VALUES(?,?,?,?,?,?,?,?,?,?);";
        try{
            PreparedStatement stm = conexao.prepareStatement(instrucao);
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
        }catch(SQLException e){
            
        }

    }
}
