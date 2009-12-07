/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.CD;
import br.edu.ifrn.dominio.Cliente;
import br.edu.ifrn.dominio.Faturamento;
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
public class FaturamentoDAO {
    
    Connection conexao;
    
    public FaturamentoDAO(){
        conexao = ConnectionFactory.getConnection();
    }

    public void addFaturamento(Faturamento ft){
        try {
            
            String ins = "INSERT INTO faturamento VALUES(?,?,?,?,?);";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, ft.getId());
            stm.setInt(2, ft.getCd());
            stm.setString(3, ft.getCli());
            stm.setString(4, ft.getFunc());
            stm.setInt(5, ft.getQuantCDs());

            stm.executeUpdate();
            stm.close();
            conexao.close();

            
        } catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
    }

    public void updateFaturamento(Faturamento ft){
        try {
           
            String ins = "UPDATE faturamento SET id=?, venda_cd_id=?, venda_cliente_cpf='?', venda_vendedor_funcionario_login='?', quantidadecds=? WHERE id=?;";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, ft.getId());
            stm.setInt(2, ft.getCd());
            stm.setString(3, ft.getCli());
            stm.setString(4, ft.getFunc());
            stm.setInt(5, ft.getQuantCDs());
            stm.setInt(6, ft.getId());

            stm.executeUpdate();
            stm.close();
            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
    }

    public void deleteFaturamento(Faturamento ft){
        try {
        
            String ins = "DELETE FROM faturamento WHERE id=?;";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setInt(1, ft.getId());

            stm.executeUpdate();
            stm.close();
            conexao.close();

        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
    }

    LinkedList<Faturamento> listaFatu = new LinkedList();
    public LinkedList<Faturamento> selectFaturamento(Faturamento ft){
        try {
         
            String ins = "SELECT * FROM faturamento;";
            PreparedStatement stm = conexao.prepareStatement(ins);
            ResultSet rs = (ResultSet) stm.executeQuery();

            Vendedor vend;
            VendedorDAO vdao = new VendedorDAO();
            LinkedList<Vendedor> listaVendedor = vdao.selectVendedor();

            Cliente cli = null;
            ClienteDAO cdao = new ClienteDAO();
            LinkedList<Cliente> listaCliente = cdao.selectCliente();

            CD disk = null;
            CDDAO cddao = new CDDAO();
            LinkedList<CD> listaCD = cddao.selectCD();
          
            while(rs.next()){
                for(CD cd: listaCD){
                if(cd.getId() == rs.getInt(2)){
                    disk = cd;
                    break;
                }
            }

            for(Cliente cliente: listaCliente){
                if(cliente.getCpf().equals(rs.getString(3))){
                    cli = cliente;
                    break;
                }
            }

            for(Vendedor vendedor: listaVendedor){
                if(vendedor.getLogin().equals(rs.getString(4))){
                    vend = vendedor;
                    Faturamento ftm = new Faturamento(rs.getInt(1),disk,cli,vend);
                    listaFatu.add(ftm);
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

        return listaFatu;
    }

    

}
