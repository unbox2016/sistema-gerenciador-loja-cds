/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SacolaCDs.java
 *
 * Created on 13/11/2009, 08:59:11
 */

package br.edu.ifrn.gui;

import java.awt.Image;

/**
 *
 * @author 2007134010556
 */
public class SacolaCDs extends javax.swing.JFrame {

    /** Creates new form SacolaCDs */
    public SacolaCDs() {
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

        scrollPane = new javax.swing.JScrollPane();
        sacola = new javax.swing.JTable();
        precoTotal = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        concluirCompra = new javax.swing.JButton();
        pesquisarCodigo = new javax.swing.JButton();
        precoTotal1 = new javax.swing.JTextField();

        setTitle("Sacola de CDs");
        setResizable(false);

        sacola.setFont(new java.awt.Font("Tahoma", 0, 12));
        sacola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Título", "Artista", "Quantidade", "Preço"
            }
        ));
        scrollPane.setViewportView(sacola);

        precoTotal.setFont(new java.awt.Font("Tahoma", 0, 12));
        precoTotal.setText("Preço Total: ");

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 0, 0));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        concluirCompra.setFont(new java.awt.Font("Tahoma", 0, 12));
        concluirCompra.setForeground(new java.awt.Color(0, 102, 0));
        concluirCompra.setText("Confirmar CDs e continuar");
        concluirCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirCompraActionPerformed(evt);
            }
        });

        pesquisarCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pesquisarCodigo.setText("Pesquisar CD");
        pesquisarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarCodigoActionPerformed(evt);
            }
        });

        precoTotal1.setEditable(false);
        precoTotal1.setFont(new java.awt.Font("Tahoma", 0, 12));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(pesquisarCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precoTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precoTotal1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                            .addComponent(concluirCompra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisarCodigo)
                    .addComponent(precoTotal)
                    .addComponent(precoTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(concluirCompra)
                    .addComponent(cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void concluirCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_concluirCompraActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_cancelarActionPerformed

    private void pesquisarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarCodigoActionPerformed
       PesquisaCD p = new PesquisaCD();
       p.setVisible(true);
    }//GEN-LAST:event_pesquisarCodigoActionPerformed

    /**
    * @param args the command line arguments
    */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton concluirCompra;
    private javax.swing.JButton pesquisarCodigo;
    private javax.swing.JLabel precoTotal;
    private javax.swing.JTextField precoTotal1;
    private javax.swing.JTable sacola;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables

}
