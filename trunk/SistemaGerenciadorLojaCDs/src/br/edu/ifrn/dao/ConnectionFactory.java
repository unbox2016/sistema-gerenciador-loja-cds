/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.h2.jdbcx.JdbcDataSource; // Classe que permite a conexão direta às bases de dados.

/**
 *
 * @author 2007134010467
 */
public class ConnectionFactory { // Método que retorna a conexão ao banco de dados.

    // Abaixo estão os dados referentes a conexão, bem como a declaração dela.
    
    // private static Connection conexao;
    private static String url = "jdbc:h2:basesdedados/pgcds";
    private static String usuario = "user";
    private static String senha = "pgcds777";
    private static Connection conexao = null;

    public static Connection getConnection(){ // Método estático que retorna a conexão, sem que seja necessário a criação de um objeto dessa classe.

            try{
                JdbcDataSource ds = new JdbcDataSource(); // Declaração do objeto que fará a conexão
                ds.setURL(url);
                ds.setUser(usuario);
                ds.setPassword(senha);
                conexao = ds.getConnection(); // Criação da conexão;

            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
            }

            return conexao;
     }
    }