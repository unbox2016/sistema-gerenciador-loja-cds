/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.Cliente;
import br.edu.ifrn.dominio.Conta;
import br.edu.ifrn.dominio.Funcionario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement ;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Denis
 */
public class ClienteDAO {

    Connection conexao;

    public ClienteDAO(){
        conexao = ConnectionFactory.getConnection();
    }

    public void addCliente(Cliente c){
        try{
            
            String ins = "INSERT INTO cliente VALUES(?,?,?,?,?,?,?,?,?);";
            PreparedStatement stm = conexao.prepareStatement(ins);

            java.util.Date data = c.getDataNasc();
            java.sql.Date datasql = new java.sql.Date(data.getTime());
            
            stm.setString(1, c.getCpf());
            stm.setInt(2, c.getConta().getCodigo());
            stm.setString(3, c.getFunc());
            stm.setString(4, c.getRg());
            stm.setString(5, c.getNome());
            stm.setString(6, c.getSexo());
            stm.setString(7, c.getTelefone());
            stm.setString(8, c.getEstCivil());
            stm.setDate(9, datasql);

            stm.executeUpdate();
            stm.close();
            conexao.close();

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
    }

    public void updateCliente(Cliente c){
        try {
            
            String ins = "UPDATE cliente SET cpf='?', conta_codigo=?, funcionario_login='?', rg='?', nome='?', sexo='?', telefone='?', estado_civil='?', dnascimento=? WHERE cpf='?';";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setString(1, c.getCpf());
            stm.setInt(2, c.getConta().getCodigo());
            stm.setString(3, c.getFunc());
            stm.setString(4, c.getRg());
            stm.setString(5, c.getNome());
            stm.setString(6, c.getSexo());
            stm.setString(7, c.getTelefone());
            stm.setString(8, c.getEstCivil());
            stm.setDate(9,(Date) c.getDataNasc());
            stm.setString(10, c.getCpf());

            stm.executeUpdate();
            stm.close();
            conexao.close();

        } catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
    }

    public void deleteCliente(Cliente c){
        try {
            
            String ins = "DELETE FROM cliente WHERE cpf='?';";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setString(1, c.getCpf());

            stm.executeUpdate();
            stm.close();
            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
    }

    public LinkedList<Cliente> selectCliente(){
        LinkedList<Cliente> listaCli = new LinkedList();
        try {
           
            String ins = "SELECT * FROM cliente;";
            PreparedStatement stm = conexao.prepareStatement(ins);

            ResultSet rs = stm.executeQuery();

            FuncionarioDAO fdao = new FuncionarioDAO();
            LinkedList<Funcionario> listaFunc = fdao.selectFuncionario();

            ContaDAO cdao = new ContaDAO();
            LinkedList<Conta> listaConta = cdao.selectConta();         
                      
            Conta conta = null;

            while(rs.next()){
                for(Conta cont: listaConta){
                    if(cont.getCodigo() == rs.getInt(2)){
                        conta = cont;
                        break; // sai do loop
                    }
                }

                for(Funcionario f: listaFunc){
                    if(f.getCpf().equals(rs.getString(3))){
                        Cliente c = new Cliente(rs.getString(1), f, rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDate(9), conta);
                        listaCli.add(c);
                        break;
                    }
                }
            }

            rs.close();
            stm.close();
            conexao.close();

        } catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }

        return listaCli;
    }

    public LinkedList<Cliente> selectStrictCliente(String dado){
        LinkedList<Cliente> listaCli = new LinkedList();
        try {

            String ins = "SELECT * FROM cliente WHERE cpf = " + dado + " OR nome = " + dado + " OR rg = " + dado + ";";
            PreparedStatement stm = conexao.prepareStatement(ins);

            ResultSet rs = stm.executeQuery();

            FuncionarioDAO fdao = new FuncionarioDAO();
            LinkedList<Funcionario> listaFunc = fdao.selectFuncionario();

            ContaDAO cdao = new ContaDAO();
            LinkedList<Conta> listaConta = cdao.selectConta();

            Conta conta = null;

            while(rs.next()){
                for(Conta cont: listaConta){
                    if(cont.getCodigo() == rs.getInt(2)){
                        conta = cont;
                        break; // sai do loop
                    }
                }

                for(Funcionario f: listaFunc){
                    if(f.getCpf().equals(rs.getString(3))){
                        Cliente c = new Cliente(rs.getString(1), f, rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDate(9), conta);
                        listaCli.add(c);
                        break;
                    }
                }
            }

            rs.close();
            stm.close();
            conexao.close();

        } catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }

        return listaCli;
    }

}
