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
    
    public GeneroDAO(){
        
    }

    public void addGenero(Genero gen){
        try{
            Connection conexao = ConnectionFactory.getConnection();
            String ins = "INSERT INTO GENERO VALUES(?);";
            PreparedStatement stm = conexao.prepareStatement(ins);
        
            stm.setString(1,gen.getNome());
            stm.executeUpdate();//Executa atualização
            stm.close();

            conexao.close();

    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }

    }

    public LinkedList<Genero> selectGenero(){
        LinkedList<Genero> listaGen = new LinkedList();
        try {
            Connection conexao = ConnectionFactory.getConnection();
            String ins = "SELECT * FROM genero;";
            PreparedStatement stm = conexao.prepareStatement(ins);

            ResultSet rs = (ResultSet) stm.executeQuery();

            while(rs.next()){
                Genero g = new Genero(rs.getString(1));
                listaGen.add(g);
            }

            stm.close();
            conexao.close();
        
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }
        return listaGen;
    }
}

