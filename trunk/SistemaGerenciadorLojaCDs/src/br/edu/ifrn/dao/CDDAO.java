/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.CD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
            String ins = "INSERT INTO cd VALUES(?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, c.getId());
            stm.setString(2, c.getFunc());
            stm.setString(3, c.getGen());
            stm.setString(4, c.getTitulo());
            stm.setInt(5, c.getAno());
            stm.setString(6, c.getArtista());
            stm.setInt(7, c.getDuracao());
            stm.setInt(8, c.getId());
            stm.setInt(9, c.getId());
            stm.setInt(10, c.getId());
            stm.setInt(11, c.getId());
            stm.setInt(12, c.getId());


            
         
        } catch(SQLException ex){
              JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }

    }
}
