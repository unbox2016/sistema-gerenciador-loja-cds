/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.CD;
import br.edu.ifrn.dominio.Funcionario;
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
public class CDDAO {

    public CDDAO(){

    }

    public void addCD(CD c) {
        try{
            Connection conexao = ConnectionFactory.getConnection();
            String ins = "INSERT INTO cd VALUES(?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, c.getId());
            stm.setString(2, c.getFunc());
            stm.setString(3, c.getGen());
            stm.setString(4, c.getTitulo());
            stm.setInt(5, c.getAno());
            stm.setString(6, c.getArtista());
            stm.setInt(7, c.getDuracao());
            stm.setInt(8, c.getNumFaixas());
            stm.setInt(9, c.getQuantidade());
            stm.setBoolean(10, c.isDisponivel());
            stm.setBoolean(11, c.isLancamento());
            stm.setDouble(12, c.getPreco());

            stm.executeUpdate();
            conexao.close();
         
        } catch(SQLException ex){
              JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }

    }

    public void updateCD(CD c){
        try {
            Connection conexao = ConnectionFactory.getConnection();
            String ins = "UPDATE cd SET id=?, funcionario_login='?', genero_nome='?', titulo='?', ano=?, artista=?, duracao=?, nfaixas=?, disponibilidade=?, lancamento=?, preco=? WHERE id=?;";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, c.getId());
            stm.setString(2, c.getFunc());
            stm.setString(3, c.getGen());
            stm.setString(4, c.getTitulo());
            stm.setInt(5, c.getAno());
            stm.setString(6, c.getArtista());
            stm.setInt(7, c.getDuracao());
            stm.setInt(8, c.getNumFaixas());
            stm.setInt(9, c.getQuantidade());
            stm.setBoolean(10, c.isDisponivel());
            stm.setBoolean(11, c.isLancamento());
            stm.setDouble(12, c.getPreco());
            stm.setInt(13, c.getId());

            stm.executeUpdate();
            stm.close();

            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }
    }

    public void deleteCD(CD c){
        try {
            Connection conexao = ConnectionFactory.getConnection();
            String ins = "DELETE FROM cd WHERE id=?";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, c.getId());

            stm.executeUpdate();
            stm.close();

            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        }

    }

    public LinkedList<CD> selectCD(CD c){
        LinkedList<CD> listaCD = new LinkedList();
        try {
            Connection conexao = ConnectionFactory.getConnection();
            String ins = "SELECT * FROM cd;";
            PreparedStatement stm = conexao.prepareStatement(ins);

            ResultSet rs = (ResultSet) stm.executeQuery();

            while(rs.next()){
                FuncionarioDAO fdao = new FuncionarioDAO();
                LinkedList<Funcionario> listaFunc = fdao.selectFuncionario();
                Funcionario func = null;
                for (Funcionario f:listaFunc){
                    if(rs.getString(2).equals(f.getLogin()))
                        func = f;
                }

                GeneroDAO gdao = new GeneroDAO();
                LinkedList<Genero> listaGen = gdao.selectGenero();
                Genero gen = null;
                for (Genero g:listaGen){
                    if(rs.getString(3).equals(g.getNome()))
                        gen = g;
                }

                CD cd = new CD(rs.getInt(1), rs.getInt(5), gen, func, rs.getString(4), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getBoolean(10), rs.getBoolean(11), rs.getDouble(12));
                listaCD.add(c);
            }

            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados." + ex.getMessage());
        } finally{
            return listaCD;
        }

    }
}
