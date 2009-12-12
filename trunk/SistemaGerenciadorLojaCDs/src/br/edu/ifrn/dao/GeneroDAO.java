/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.Genero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author 2007134010467
 */
public class GeneroDAO {
    
    Connection conexao;

    public GeneroDAO(){
        conexao = ConnectionFactory.getConnection();
    }

    public void addGenero(Genero gen){
        try{
            
            String ins = "INSERT INTO genero VALUES(?);";
            PreparedStatement stm = conexao.prepareStatement(ins);
        
            stm.setString(1,gen.getNome());
            stm.executeUpdate();//Executa atualização
            stm.close();

            conexao.close();

    }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }

    }




    public LinkedList<Genero> selectGenero(){
        LinkedList<Genero> listaGen = new LinkedList();
        try {
           
            String ins = "SELECT * FROM genero;";
            PreparedStatement stm = conexao.prepareStatement(ins);

            ResultSet rs = stm.executeQuery();

            while(rs.next()){
                Genero g = new Genero(rs.getString(1));
                listaGen.add(g);
            }

            rs.close();
            stm.close();
            conexao.close();
        
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
        return listaGen;
    }

}

