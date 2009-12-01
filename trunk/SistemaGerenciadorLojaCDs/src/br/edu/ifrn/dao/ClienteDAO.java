/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            String instrucao = "INSERT INTO cliente VALUES(?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement stm = conexao.prepareStatement(instrucao);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }

    }
    

}
