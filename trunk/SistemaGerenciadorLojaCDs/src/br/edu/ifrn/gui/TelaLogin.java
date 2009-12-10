/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaLogin.java
 *
 * Created on 12/11/2009, 13:19:35
 */

package br.edu.ifrn.gui;

import br.edu.ifrn.dao.FuncionarioDAO;
import br.edu.ifrn.dominio.Funcionario;
import java.awt.Image;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author 2007134010467
 */
public class TelaLogin extends javax.swing.JFrame {

    /** Creates new form TelaLogin */
    public TelaLogin() {
        initComponents();
    }

    private Image icone() {
            return new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imagens/icone.png")).getImage();
       }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        efeturarLogin = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Gereciador de Loja de CDs");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Faça o login preenchendo todos os campos abaixo:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setText("Login:");

        login.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel3.setText("Senha:");

        efeturarLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        efeturarLogin.setForeground(new java.awt.Color(0, 102, 0));
        efeturarLogin.setText("Efetuar Login");
        efeturarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efeturarLoginActionPerformed(evt);
            }
        });

        limpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 12));
        cancelar.setForeground(new java.awt.Color(255, 0, 0));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(efeturarLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(separador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(senha))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(limpar)
                    .addComponent(efeturarLogin))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void efeturarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efeturarLoginActionPerformed
        boolean aux = false; // variavel auxiliar p/ verificar se o login e a senha não correspondem a nenhum funcionario
        LinkedList<Funcionario> list;
        FuncionarioDAO funcdao = new FuncionarioDAO();

        list = funcdao.selectFuncionario();
        String log = login.getText();
        String sen = senha.getText();

       for(Funcionario f: list){
           if ((f.getLogin().equals(log))&&(f.getSenha().equals(sen))){
               if(f.isIsAdm()){
                    TelaPrincipalAdministrador tpa = new TelaPrincipalAdministrador(f);
                    this.setVisible(false);
                    tpa.setVisible(true);
                    this.dispose();
                    break;
               }
               else{
                    TelaPrincipalFuncionario tpf = new TelaPrincipalFuncionario(f);
                    tpf.setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                    break;
               }
           }

           else {
               aux = true;
           }
        }

       if(aux){ // Se o login e a senha digitados não correspondem a algum funcionário
          JOptionPane.showMessageDialog(null,"O login ou a senha estão incorretos. Tente novamente");
       }

    }//GEN-LAST:event_efeturarLoginActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
       senha.setText("");
       login.setText("");
    }//GEN-LAST:event_limparActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelarActionPerformed

    /**
    * @param args the command line arguments
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton efeturarLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField senha;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables

}
