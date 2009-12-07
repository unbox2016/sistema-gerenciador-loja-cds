/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.Administrador;
import br.edu.ifrn.dominio.Vendedor;
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
public class VendedorDAO {

    private FuncionarioDAO fdao = new FuncionarioDAO();
    Connection conexao;

    public VendedorDAO(){
        conexao = ConnectionFactory.getConnection();
    }

    public void addVendedor(Vendedor v){

        try{

            
            String ins = "INSERT INTO vendedor VALUES(?,?);";
            PreparedStatement stm = conexao.prepareStatement(ins);
            stm.setString(1, v.getLogin());
            stm.setString(2, v.getAdm());

            fdao.addFuncionario(v);

            stm.executeUpdate();
            conexao.close();

        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }

    }

    public void updateVendedor(Vendedor v){
        fdao.updateFuncionario(v);

    }
    public void deleteVendedor(Vendedor v){
        try {
            
            String ins = "DELETE FROM vendedor WHERE funcionario_login='?'";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setString(1, v.getLogin());
            fdao.deleteFuncionario(v);

            stm.executeUpdate();
            stm.close();

            conexao.close();

        } catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }

    }
    public LinkedList<Vendedor> selectVendedor(){
        LinkedList<Vendedor> listaVend = new LinkedList();
         try {
            
            String ins = "SELECT * FROM funcionario, vendedor WHERE funcionario.login = vendedor.funcionario_login;";
            PreparedStatement stm = conexao.prepareStatement(ins);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                AdministradorDAO adao = new AdministradorDAO();
                LinkedList<Administrador> listaAdm = adao.selectAdministrador();
                Administrador adm = null;
                for (Administrador a:listaAdm){
                    if(rs.getString(12).equals(a.getLogin()))
                        adm = a;
                }
                Vendedor a = new Vendedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getBoolean(10), adm);
                listaVend.add(a);
            }

            rs.close();
            stm.close();
            conexao.close();

        } catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        } finally{
             return listaVend;
        }
 
    }

}
