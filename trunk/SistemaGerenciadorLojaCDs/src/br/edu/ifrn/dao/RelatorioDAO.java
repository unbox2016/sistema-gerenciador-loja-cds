/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dao;

import br.edu.ifrn.dominio.Administrador;
import br.edu.ifrn.dominio.CD;
import br.edu.ifrn.dominio.Cliente;
import br.edu.ifrn.dominio.Faturamento;
import br.edu.ifrn.dominio.Relatorio;
import br.edu.ifrn.dominio.Vendedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author 2007134010467
 */
public class RelatorioDAO {

    Connection conexao;

    public RelatorioDAO(){
        conexao = (Connection) ConnectionFactory.getConnection();
    }

    public void addRelatorio(Relatorio r){
        try{
            String ins = "INSERT INTO relatorio VALUES(?,?,?,?,?,?,?)";
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setDate(1,(Date) r.getData());
            stm.setTime(2, r.getHora());
            stm.setString(3, r.getAdm());
            stm.setString(4, r.getVen());
            stm.setString(5, r.getCli());
            stm.setInt(6, r.getCd());
            stm.setInt(7, r.getFat());

            stm.executeUpdate();
            stm.close();

            conexao.close();

        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
        
    }

    public void deleteRelatorio(Relatorio r){
        try{
            String ins = "DELETE FROM relatorio WHERE codigo=?";
            conexao.prepareStatement(ins);
            PreparedStatement stm = conexao.prepareStatement(ins);

            stm.setDate(1,(Date) r.getData());

            stm.executeUpdate();
            stm.close();
            conexao.close();
        } catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados. \n" + ex.getMessage());
        }
    }

    public LinkedList<Relatorio> selectRelatorio(){
        LinkedList<Relatorio> listaRel = new LinkedList();
        try{
            String ins = "SELECT * FROM relatorio";
            PreparedStatement stm = conexao.prepareStatement(ins);

            ResultSet rs = stm.executeQuery();

            while(rs.next()){
                ClienteDAO cdao = new ClienteDAO();
                LinkedList<Cliente> listaCli  = cdao.selectCliente();
                Cliente cli = null;
                for(Cliente c: listaCli){
                    if(rs.getString(5).equals(c.getCpf()))
                        cli = c;
                }

                VendedorDAO vdao = new VendedorDAO();
                LinkedList<Vendedor> listaVend  = vdao.selectVendedor();
                Vendedor vend = null;
                for(Vendedor v: listaVend){
                    if(rs.getString(4).equals(v.getLogin()))
                        vend = v;
                }

                AdministradorDAO adao = new AdministradorDAO();
                LinkedList<Administrador> listaAdm = adao.selectAdministrador();
                Administrador adm = null;
                for(Administrador a: listaAdm){
                    if(rs.getString(3).equals(a.getLogin()))
                        adm = a;

                }

                CDDAO cddao = new CDDAO();
                LinkedList<CD> listaCD = cddao.selectCD();
                CD cd = null;
                for(CD c: listaCD){
                    if(rs.getInt(6) == c.getId())
                        cd = c;
                }

                FaturamentoDAO fdao = new FaturamentoDAO();
                LinkedList<Faturamento> listaFatu = fdao.selectFaturamento();
                Faturamento fat = null;
                for(Faturamento f: listaFatu){
                    if(rs.getInt(7) == f.getId())
                        fat = f;
                }

                Relatorio rel = new Relatorio(rs.getDate(1), rs.getTime(2), cd, cli, adm, vend,  fat);

            }

        }finally{
            return listaRel;
        }
    }



}
