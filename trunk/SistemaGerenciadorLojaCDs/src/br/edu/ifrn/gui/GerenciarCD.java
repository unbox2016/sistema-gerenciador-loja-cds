/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdateCD.java
 *
 * Created on 02/12/2009, 11:21:16
 */

package br.edu.ifrn.gui;

import br.edu.ifrn.dao.CDDAO;
import br.edu.ifrn.dao.FuncionarioDAO;
import br.edu.ifrn.dao.GeneroDAO;
import br.edu.ifrn.dominio.CD;
import br.edu.ifrn.dominio.Funcionario;
import br.edu.ifrn.dominio.Genero;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 2007134010475
 */
public class GerenciarCD extends javax.swing.JFrame {

    /** Creates new form UpdateCD */
    public GerenciarCD() {
        initComponents();
        generateTable();
    }

    public void generateTable(){
        LinkedList<CD> listaCD;
        CDDAO dao = new CDDAO();
        listaCD = dao.selectCD();

        Object[][] tableCD = new Object[listaCD.size()][12];
        int pos = 0;
        String[] colunas = {"ID","Ano","Genero","Titulo","Preco","Artista","Duração","Número de faixas","Quantidade","Disponível","Lançamento","Cadastrado por:"};
        Iterator<CD> it = listaCD.iterator();

        while(it.hasNext()){
            CD cd = it.next();

            tableCD[pos][0] = cd.getId();
            tableCD[pos][1] = cd.getAno();
            tableCD[pos][2] = cd.getGen();
            tableCD[pos][3] = cd.getTitulo();
            tableCD[pos][4] = cd.getPreco();
            tableCD[pos][5] = cd.getArtista();
            tableCD[pos][6] = cd.getDuracao();
            tableCD[pos][7] = cd.getNumFaixas();
            tableCD[pos][8] = cd.getQuantidade();
            tableCD[pos][9] = cd.isDisponivel();
            tableCD[pos][10] = cd.isLancamento();
            tableCD[pos][11] = cd.getFunc();

            pos++;

        }

        editarCD.setModel(new DefaultTableModel(tableCD,colunas));

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
        editarCD = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        confirmar = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        editarCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Ano", "Genero", "Titulo", "Preco", "Artista", "Duração", "Número de faixas", "Quantidade", "Disponível", "Lançamento", "Cadastrado por:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(editarCD);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Edição de CDs");

        confirmar.setFont(new java.awt.Font("Tahoma", 0, 12));
        confirmar.setForeground(new java.awt.Color(0, 102, 0));
        confirmar.setText("Confirmar alterações");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        deletar.setFont(new java.awt.Font("Tahoma", 0, 12));
        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(confirmar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deletar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cancelar))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(deletar)
                    .addComponent(confirmar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.setVisible(false);
    }                                        

    CDDAO cddao = new CDDAO();
    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        int index = editarCD.getSelectedRow();
        CD cdDel = null;
        editarCD.remove(index);
        cddao.deleteCD(cdDel);
    }//GEN-LAST:event_deletarActionPerformed
/*
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed
*/
    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        CD cdEdit;
        for(int i=0;i<editarCD.getRowCount();i++){
            cdEdit = getCD(editarCD.getSelectedRow());
            editarCD(cdEdit,editarCD.getSelectedRow());
        }
    }//GEN-LAST:event_confirmarActionPerformed

    /**
    * @param args the command line arguments
    */

    public void editarCD(CD cd, int linha){
        boolean corretos = true;

        try {
            int id = (Integer) editarCD.getValueAt(linha, 0);
            int ano = (Integer) editarCD.getValueAt(linha, 1);
            int dur = (Integer) editarCD.getValueAt(linha, 6);
            int numF = (Integer) editarCD.getValueAt(linha, 7);
            int quant = (Integer) editarCD.getValueAt(linha, 8);
            double preco = (Double) editarCD.getValueAt(linha, 4);
            
        } catch(NumberFormatException nfx){
            JOptionPane.showMessageDialog(null, "Por favor, digite apenas números para CPF, RG ou Telefone.");
            corretos = false;
        }

        if(corretos){
            cddao.updateCD(cd);
            JOptionPane.showMessageDialog(null, "Edição realizada com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, digite apenas números para ID, Ano, Duração, Número de faixas, Quantidade ou Preço.");
        }

    }

    LinkedList<Funcionario> funcLista;
    LinkedList<Genero> genList;
    public CD getCD(int linha){
        boolean existeNoBD = true;

        int id = (Integer) editarCD.getValueAt(linha, 0);
        int ano = (Integer) editarCD.getValueAt(linha, 1);

        String genero = (String) editarCD.getValueAt(linha, 2);
        Genero gen = null;

        String tit = (String) editarCD.getValueAt(linha, 3);
        double preco = (Double) editarCD.getValueAt(linha, 4);
        String art = (String) editarCD.getValueAt(linha, 5);
        int dur = (Integer) editarCD.getValueAt(linha, 6);
        int numF = (Integer) editarCD.getValueAt(linha, 7);
        int quant = (Integer) editarCD.getValueAt(linha, 8);
        boolean disp = (Boolean) editarCD.getValueAt(linha, 9);
        boolean lanc = (Boolean) editarCD.getValueAt(linha, 10);

        String funcLog = (String) editarCD.getValueAt(linha, 11);
        Funcionario func = null;
               
        funcLista = new FuncionarioDAO().selectFuncionario();
        genList = new GeneroDAO().selectGenero();

        for(Funcionario f:funcLista){
            if(f.getLogin().equals(funcLog)){
                func = f;
                break;
            }
        }

        for(Genero g:genList){
            if(g.getNome().equals(genero)){
                existeNoBD = true;
                gen = new Genero(genero);
                break;
            }
            else {
              existeNoBD = false;
            }
        }

        if(!existeNoBD){
            JOptionPane.showMessageDialog(null, "O gênero digitado não consta no banco de dados. Por favor, insira outro");
            return null;
        }
        else {
            return new CD(id,ano,gen,func,tit,art,dur,numF,quant,disp,lanc,preco);
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton confirmar;
    private javax.swing.JButton deletar;
    private javax.swing.JTable editarCD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
