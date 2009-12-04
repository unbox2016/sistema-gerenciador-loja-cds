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
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author 2007134010467
 */
public class FuncionarioDAO {

    Connection conexao;
    
    public FuncionarioDAO(){
        conexao = ConnectionFactory.getConnection();
    }

    public void addFuncionario(Funcionario f){
        try {
            
            String ins = "INSERT INTO funcionario VALUES(?,?,?,?,?,?,?,?,?,?);";
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
            stm.setBoolean(10, f.isIsAdm());

            stm.executeUpdate();
            stm.close();

            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }
    }

    public void updateFuncionario(Funcionario f){
        try {
            
            String ins = "UPDATE funcionario SET login='?', senha='?', nome='?', cpf='?', rg='?', dnascimento=?, sexo='?', telefone='?', estado_civil='?', isadm=? WHERE login='?';";
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
            stm.setBoolean(10, f.isIsAdm());
            stm.setString(11, f.getLogin());

            stm.executeUpdate();
            stm.close();

            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }
    }

    public void deleteFuncionario(Funcionario f){
        try {
            
            String ins = "DELETE FROM funcionario WHERE login='?';";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setString(1, f.getLogin());

            stm.executeUpdate();
            stm.close();

            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }
    }

    
    public LinkedList<Funcionario> selectFuncionario(){
        LinkedList<Funcionario> listaFunc = new LinkedList();
        try {
           
            String ins = "SELECT * FROM funcionario;";
            PreparedStatement stm = conexao.prepareStatement(ins);

            ResultSet rs = (ResultSet) stm.executeQuery();

            while(rs.next()){
                Funcionario f = new Funcionario(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getDate(9), rs.getBoolean(10));
                listaFunc.add(f);
            }

            rs.close();
            stm.close();
            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }
        
        return listaFunc;
    }

}
