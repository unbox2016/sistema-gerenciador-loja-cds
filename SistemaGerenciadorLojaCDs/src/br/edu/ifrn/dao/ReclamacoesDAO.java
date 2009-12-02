/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.Reclamacoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 2007134010467
 */
public class ReclamacoesDAO {

    public ReclamacoesDAO(){
    }

    public void addReclamacoes(Reclamacoes rec){
        try{
            Connection conexao = ConnectionFactory.getConnection();
            String ins = "INSERT INTO RECLAMACOES VALUES(?,?,?)";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, rec.getCodigo());
            stm.setString(2, rec.getConteudo());
            stm.setString(3, rec.getCli());

            stm.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }

    }
}
