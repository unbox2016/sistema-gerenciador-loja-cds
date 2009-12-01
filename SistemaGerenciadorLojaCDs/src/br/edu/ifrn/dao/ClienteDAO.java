/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.Cliente;
import br.edu.ifrn.dominio.Funcionario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Denis
 */
public class ClienteDAO {

    public ClienteDAO(){

    }

    public void addCliente(Cliente c){
        try{
            Connection conexao = ConnectionFactory.getConnection();
            String ins = "INSERT INTO cliente VALUES(?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement stm = conexao.prepareStatement(ins);
            
            stm.setString(1, c.getCpf());
            stm.setInt(2, c.getConta().getCodigo());
            stm.setString(3, c.getFunc().getLogin());
            stm.setString(4, c.getRg());
            stm.setString(5, c.getNome());
            stm.setString(6, c.getSexo());
            stm.setString(7, c.getTelefone());
            stm.setString(8, c.getEstCivil());
            stm.setDate(9,(Date) c.getDataNasc());
            stm.executeUpdate();
            stm.close();

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }

    } 

}
