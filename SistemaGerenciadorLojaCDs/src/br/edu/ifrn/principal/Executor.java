/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.principal;

import br.edu.ifrn.dao.AdministradorDAO;
import br.edu.ifrn.dominio.Administrador;
import br.edu.ifrn.gui.CadastroAdministrador;
import br.edu.ifrn.gui.TelaLogin;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cliente
 */
public class Executor {

    
    AdministradorDAO admdao = new AdministradorDAO();
    LinkedList<Administrador> list;
    private boolean test;

    public Executor() {
        list = admdao.selectAdministrador();
        
        for(Administrador a:list){
            if(a == null){
                test = false;
            }
            else {
                test = true;
                break;
            }
        }

        if(test){
            new TelaLogin().setVisible(true);
        }

        else {
            JOptionPane.showMessageDialog(null, "Ainda não existe nenhum funcionário cadastrado. Cadastre o administrador.");
            new CadastroAdministrador().setVisible(true);
        }

    }

}
