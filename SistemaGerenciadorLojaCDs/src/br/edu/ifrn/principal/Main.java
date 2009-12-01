/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.principal;


import br.edu.ifrn.gui.TelaPrincipalAdministrador;

/**
 *
 * @author Cliente
 */
public class Main {
    
    public static void main(String args[]){
                    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalAdministrador().setVisible(true);
            }
        });

    }

}
