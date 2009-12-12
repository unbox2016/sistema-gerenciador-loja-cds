/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdateCliente.java
 *
 * Created on 02/12/2009, 11:08:40
 */

package br.edu.ifrn.gui;

import br.edu.ifrn.dao.ClienteDAO;
import br.edu.ifrn.dao.FuncionarioDAO;
import br.edu.ifrn.dominio.Cliente;
import br.edu.ifrn.dominio.Funcionario;
import br.edu.ifrn.dominio.Conta;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 2007134010475
 */
public class GerenciarCliente extends javax.swing.JFrame {

    /** Creates new form UpdateCliente */
    public GerenciarCliente() {
        initComponents();
        generateTable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        editarCliente = new javax.swing.JTable();
        confirmar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        editarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "RG", "Nome", "Sexo", "Telefone", "Estado civil", "Data de nascimento", "Conta", "Cadastrado por:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(editarCliente);

        confirmar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        confirmar.setForeground(new java.awt.Color(0, 102, 0));
        confirmar.setText("Confirmar alterações");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        limpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        limpar.setText("Deletar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(confirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(limpar)
                    .addComponent(confirmar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void generateTable(){
        LinkedList<Cliente> listaClientes;
        ClienteDAO clidao = new ClienteDAO();
        listaClientes = clidao.selectCliente();

        Object[][] tableCli = new Object[listaClientes.size()][9];
        int pos = 0;
        String colunas[] = {"CPF", "RG","Nome","Sexo","Telefone","Estado Civil","Data de Nascimento","Conta","Cadastrado por:"};
        Iterator<Cliente> it = listaClientes.iterator();

        while(it.hasNext()){
            Cliente cli = it.next();

            tableCli[pos][0] = cli.getCpf();
            tableCli[pos][1] = cli.getRg();
            tableCli[pos][2] = cli.getNome();
            tableCli[pos][3] = cli.getSexo();
            tableCli[pos][4] = cli.getTelefone();
            tableCli[pos][5] = cli.getEstCivil();
            tableCli[pos][6] = cli.getDataNasc();
            tableCli[pos][7] = cli.getConta().getCodigo();
            tableCli[pos][8] = cli.getFunc();
            
            pos++;   
        }
        editarCliente.setModel(new DefaultTableModel(tableCli, colunas));
    }


    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    ClienteDAO cdao = new ClienteDAO();
    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        int index = editarCliente.getSelectedRow();
        Cliente cliDel = getCliente(index);
        editarCliente.remove(index);
        cdao.deleteCliente(cliDel);
    }//GEN-LAST:event_limparActionPerformed

    
    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        Cliente cliAdd;
        for(int i=0;i<editarCliente.getRowCount();i++){
                cliAdd = getCliente(editarCliente.getSelectedRow());
                addOuEditar(cliAdd);
            }
    }//GEN-LAST:event_confirmarActionPerformed

    private Cliente getCliente(int linha){
        String cpf = (String) editarCliente.getValueAt(linha, 0);
        String rg = (String) editarCliente.getValueAt(linha, 1);
        String nome = (String) editarCliente.getValueAt(linha, 2);
        String sexo = (String) editarCliente.getValueAt(linha, 3);
        String tel = (String) editarCliente.getValueAt(linha, 4);
        String est = (String) editarCliente.getValueAt(linha, 5);
        java.util.Date dnasc = (java.util.Date) editarCliente.getValueAt(linha, 6);
        Conta cont = (Conta) editarCliente.getValueAt(linha, 7);
        Funcionario fun = null;

        LinkedList<Funcionario> lf = new FuncionarioDAO().selectFuncionario();

        for(Funcionario funcio:lf){
            if(funcio.getLogin().equals((String) editarCliente.getValueAt(linha, 8))){
                fun = funcio;
                break;
            }
        }

        return new Cliente(cpf,fun,rg,nome,sexo,tel,est,dnasc,cont);

    }


    LinkedList<Cliente> cliList;
    private void addOuEditar(Cliente c){
        boolean existe = false;
        cliList = cdao.selectCliente();

        for(Cliente cli:cliList){
            if(cli.getFunc().equals(cli.getFunc()))
                existe = true;
            else
                existe = false;
        }

        if(existe)
            cdao.updateCliente(c);
        else
            cdao.addCliente(c);
    }


    /**
    * @param args the command line arguments
    */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton confirmar;
    private javax.swing.JTable editarCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpar;
    // End of variables declaration//GEN-END:variables

}
