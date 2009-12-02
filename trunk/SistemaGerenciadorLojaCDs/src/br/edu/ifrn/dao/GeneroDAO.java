/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.Genero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 2007134010467
 */
public class GeneroDAO {
    
    public GeneroDAO(){
        
    }

    public void addGenero(Genero gen){
        try{
            Connection conexao = ConnectionFactory.getConnection();
            String ins = "INSERT INTO GENERO VALUES(?);";
            PreparedStatement stm = conexao.prepareStatement(ins);
        
            stm.setString(1,gen.getNome());
            stm.executeUpdate();//Executa atualização
    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }

    }
}

