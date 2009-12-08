/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.Cliente;
import br.edu.ifrn.dominio.Reclamacoes;
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
public class ReclamacoesDAO {

    Connection conexao;

    public ReclamacoesDAO(){
        conexao = ConnectionFactory.getConnection();
    }

    public void addReclamacoes(Reclamacoes rec){
        try{
            
            String ins = "INSERT INTO RECLAMACOES VALUES(?,?,?)";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, rec.getCodigo());
            stm.setString(2, rec.getConteudo());
            stm.setString(3, rec.getCli());

            stm.executeUpdate();
            stm.close();

            conexao.close();
            
        }catch(SQLException ex){
              JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }

    }

    public void deleteReclamacoes(Reclamacoes r){
        try{
            String ins = "DELETE FROM reclamacoes WHERE codigo=?";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, r.getCodigo());

            stm.executeUpdate();
            stm.close();

            conexao.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
    }

    public LinkedList<Reclamacoes> selectReclamacoes(){
        LinkedList<Reclamacoes> listaReclam = new LinkedList();
        try{
            String ins = "SELECT * FROM reclamacoes";
            PreparedStatement stm = conexao.prepareStatement(ins);

            ResultSet rs = stm.executeQuery();

            ClienteDAO cdao = new ClienteDAO();
            LinkedList<Cliente> listaCli = cdao.selectCliente();

            while(rs.next()){
                
                Cliente cli = null;
                for(Cliente c:listaCli){
                    if(rs.getString(2).equals(c.getCpf()))
                        cli = c;
                }

                Reclamacoes r = new Reclamacoes(rs.getInt(1), cli, rs.getString(3));
                listaReclam.add(r);

            }

            rs.close();
            stm.close();
            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        } finally{
            return listaReclam;
        }


    }
}
