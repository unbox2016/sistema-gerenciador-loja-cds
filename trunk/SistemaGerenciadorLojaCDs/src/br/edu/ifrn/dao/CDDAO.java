/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.CD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 2007134010467
 */
public class CDDAO {

    public CDDAO(){

    }

    public void addCD(CD c) {
        try{
            Connection conexao = ConnectionFactory.getConnection();
            String ins = "INSERT INTO cd VALUES(?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement stm = conexao.prepareStatement(ins);
            
         
    } catch(SQLException ex){
        
    }

    }
}
