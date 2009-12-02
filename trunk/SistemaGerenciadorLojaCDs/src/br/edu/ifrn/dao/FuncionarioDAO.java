/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 2007134010467
 */
public class FuncionarioDAO {

    public void addFuncionario(Funcionario f){
        try {
            Connection conexao = ConnectionFactory.getConnection();
            String ins = "INSERT INTO funcionario VALUES(?,?,?,?,?,?,?,?,?);";
            PreparedStatement stm = conexao.prepareStatement(ins);
            
            stm.setString(1, f.getLogin());
            stm.setString(2, f.getSenha());
            stm.setString(3, f.getNome());
            stm.setString(4, f.getCpf());
            stm.setString(5, f.getRg());
            stm.setDate(6, (Date) f.getDNascimento());
            stm.setString(7, f.getSexo());
            stm.setString(8, f.getTelefone());
            stm.setString(9, f.getEstCivil());

            stm.executeUpdate();
            stm.close();


        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }
    }

    public void updateFuncionario(Funcionario f){
        try {
            Connection conexao = ConnectionFactory.getConnection();
            String ins = "UPDATE funcionario SET login='?', senha='?', nome='?', cpf='?',   ";
            PreparedStatement stm = conexao.prepareStatement(ins);
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }
    }

}
