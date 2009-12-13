/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdateFuncionario.java
 *
 * Created on 02/12/2009, 11:29:03
 */

package br.edu.ifrn.gui;

import br.edu.ifrn.dao.AdministradorDAO;
import br.edu.ifrn.dao.FuncionarioDAO;
import br.edu.ifrn.dao.VendedorDAO;
import br.edu.ifrn.dominio.Administrador;
import br.edu.ifrn.dominio.Funcionario;
import br.edu.ifrn.dominio.Vendedor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 2007134010475
 */
public class GerenciarFuncionario extends javax.swing.JFrame {

    /** Creates new form UpdateFuncionario */
    public GerenciarFuncionario() {
        fdao = new FuncionarioDAO();
        listaFunc = fdao.selectFuncionario();
        initComponents();
        generateTable();
    }

    LinkedList<Funcionario> listaFunc;
    FuncionarioDAO fdao;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        editarFuncionarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        confirmar = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        editarFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Login", "Senha", "Nome", "Sexo", "CPF", "RG", "Telefone", "Estado civil", "Data de nascimento", "Administrador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(editarFuncionarios);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Edição de funcionários");

        confirmar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        confirmar.setForeground(new java.awt.Color(0, 102, 0));
        confirmar.setText("Confirmar alterações");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        deletar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 12));
        cancelar.setForeground(new java.awt.Color(255, 0, 0));
        cancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(confirmar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deletar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cancelar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(deletar)
                    .addComponent(confirmar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        // TODO add your handling code here:
        int index = editarFuncionarios.getSelectedRow();
        Funcionario fDel = getFuncionario(index);
        if(fDel.isIsAdm()){
            AdministradorDAO adao = new AdministradorDAO();
            adao.deleteAdministrador((Administrador) fDel);
        }else{
            VendedorDAO vdao = new VendedorDAO();
            vdao.deleteVendedor((Vendedor) fDel);
        }

        fdao.deleteFuncionario(fDel);

}//GEN-LAST:event_deletarActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i < editarFuncionarios.getRowCount(); i++){
            Funcionario fun = getFuncionario(i);
            editar(fun);
        }

        
    }//GEN-LAST:event_confirmarActionPerformed

    /**
    * @param args the command line arguments
    */

   private Funcionario getFuncionario(int index){
       String login = (String) editarFuncionarios.getValueAt(index, 0);
       String senha = (String) editarFuncionarios.getValueAt(index, 1);
       String nome = (String) editarFuncionarios.getValueAt(index, 2);
       String sexo = (String) editarFuncionarios.getValueAt(index, 3);
       String telefone = (String) editarFuncionarios.getValueAt(index, 6);
       String estCivil = (String) editarFuncionarios.getValueAt(index, 7);
       String cpf = (String) editarFuncionarios.getValueAt(index, 4);
       String rg = (String) editarFuncionarios.getValueAt(index, 5);
       Date dataNasc = (Date) editarFuncionarios.getValueAt(index, 8);
       boolean adm = (Boolean) editarFuncionarios.getValueAt(index, 9);

       boolean corretos = true;

       try{
           Float.parseFloat(rg);
           Float.parseFloat(cpf);
           Float.parseFloat(telefone);
       }catch(NumberFormatException ex){
           corretos = false;
       }

       if(corretos)
            return new Funcionario(login, senha, nome, cpf, rg, dataNasc, sexo, telefone, estCivil, adm);
       else{
           JOptionPane.showMessageDialog(null, "Por favor, digite apenas números para CPF, RG ou Telefone.");
           return null;
       }

   }
   
   private void editar(Funcionario f){
       for(Funcionario func: listaFunc){
            if(!func.equals(f)){
               fdao.updateFuncionario(f);
            }

       }
   }

   private void generateTable(){
        Object[][] tableFunc = new Object[listaFunc.size()][10];
        int pos = 0;
        String colunas[] = {"Login", "Senha","Nome","Sexo","CPF","RG","Telefone","Estado civil","Data de nascimento","Administrador"};
        Iterator<Funcionario> it = listaFunc.iterator();

        String formato = "dd/MM/yyyy";
        SimpleDateFormat formatter = new SimpleDateFormat(formato);

        while(it.hasNext()){
            Funcionario func = it.next();

            tableFunc[pos][0] = func.getLogin();
            tableFunc[pos][1] = func.getSenha();
            tableFunc[pos][2] = func.getNome();
            tableFunc[pos][3] = func.getSexo();
            tableFunc[pos][4] = func.getCpf();
            tableFunc[pos][5] = func.getRg();
            tableFunc[pos][6] = func.getTelefone();
            tableFunc[pos][7] = func.getEstCivil();
            tableFunc[pos][8] = formatter.format(func.getDNascimento());
            tableFunc[pos][9] = func.isIsAdm();

            pos++;
        }
        editarFuncionarios.setModel(new DefaultTableModel(tableFunc, colunas));
   }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton confirmar;
    private javax.swing.JButton deletar;
    private javax.swing.JTable editarFuncionarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
