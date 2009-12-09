/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastroAdministrador.java
 *
 * Created on 10/11/2009, 11:45:13
 */

package br.edu.ifrn.gui;

import br.edu.ifrn.dao.AdministradorDAO;
import br.edu.ifrn.dominio.Administrador;
import java.awt.Image;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 2007134010556
 */
public class CadastroAdministrador extends javax.swing.JFrame {

    /** Creates new form CadastroAdministrador */
    public CadastroAdministrador() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        estCiv = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        senhaConf = new javax.swing.JPasswordField();
        dia = new javax.swing.JComboBox();
        mes = new javax.swing.JComboBox();
        ano = new javax.swing.JComboBox();
        masculino = new javax.swing.JRadioButton();
        feminino = new javax.swing.JRadioButton();
        casado = new javax.swing.JRadioButton();
        solteiro = new javax.swing.JRadioButton();
        cadastrar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Administrador");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setText("Login:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setText("Senha:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel3.setText("Confirme a senha:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel4.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel5.setText("CPF:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel6.setText("RG:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel7.setText("Data de Nascimento:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel8.setText("Sexo:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel9.setText("Telefone:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel10.setText("Estado Civil:");

        login.setFont(new java.awt.Font("Tahoma", 0, 12));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        nome.setFont(new java.awt.Font("Tahoma", 0, 12));

        cpf.setFont(new java.awt.Font("Tahoma", 0, 12));

        rg.setFont(new java.awt.Font("Tahoma", 0, 12));

        telefone.setFont(new java.awt.Font("Tahoma", 0, 12));

        senha.setFont(new java.awt.Font("Tahoma", 0, 12));

        senhaConf.setFont(new java.awt.Font("Tahoma", 0, 12));

        dia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        mes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março ", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        ano.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009" }));

        sexo.add(masculino);
        masculino.setFont(new java.awt.Font("Tahoma", 0, 12));
        masculino.setSelected(true);
        masculino.setText("Masculino");

        sexo.add(feminino);
        feminino.setFont(new java.awt.Font("Tahoma", 0, 12));
        feminino.setText("Feminino");

        estCiv.add(casado);
        casado.setFont(new java.awt.Font("Tahoma", 0, 12));
        casado.setText("Casado(a)");

        estCiv.add(solteiro);
        solteiro.setFont(new java.awt.Font("Tahoma", 0, 12));
        solteiro.setSelected(true);
        solteiro.setText("Solteiro(a)");

        cadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cadastrar.setForeground(new java.awt.Color(0, 102, 0));
        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        limpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        limpar.setText("Limpar");
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

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel11.setText("Preencha todos os campos abaixo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addContainerGap(184, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(separador, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(senhaConf, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(senha))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(solteiro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(casado))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(masculino)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(feminino)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ano, 0, 69, Short.MAX_VALUE)))
                            .addGap(61, 61, 61)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(senhaConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(masculino)
                    .addComponent(feminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(solteiro)
                    .addComponent(casado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(limpar)
                    .addComponent(cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_loginActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        // TODO add your handling code here:
        login.setText("");
        senha.setText("");
        senhaConf.setText("");
        nome.setText("");
        cpf.setText("");
        rg.setText("");
        dia.setSelectedIndex(0);
        mes.setSelectedIndex(0);
        ano.setSelectedIndex(0);
        masculino.setSelected(true);
        telefone.setText("");
        solteiro.setSelected(true);
    }//GEN-LAST:event_limparActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:

        
        String log = login.getText();
        String sen = senha.getText();
        String senConf = senhaConf.getText();
        String nom = nome.getText();
       
        int di = dia.getSelectedIndex() + 1;
        int me = mes.getSelectedIndex() + 1;
        int an = ano.getSelectedIndex() + 1900;
        Date datan = new Date(an, me, di);
        String sex = masculino.isSelected()?"Masculino":"Feminino";
        String estadciv = solteiro.isSelected()?"Solteiro(a)":"Casado(a)";
        String cp = cpf.getText();
        String r = rg.getText();
        String telef = telefone.getText();

        boolean corretos = true;

        try{
            Float.parseFloat(cp);
            Float.parseFloat(r);
            Float.parseFloat(telef);
            
        }catch(NumberFormatException ex){
            corretos = false;
            JOptionPane.showMessageDialog(null, "Por favor, digite apenas números para CPF, RG ou Telefone.");
        }
        
        
        if(sen.equals(senConf)){
            if(corretos){
                AdministradorDAO adao = new AdministradorDAO();
                Administrador adm = new Administrador(log, sen, nom, sex, telef, estadciv, cp, r, datan);
                adao.addAdministrador(adm);
            }

        } else{
            JOptionPane.showMessageDialog(null, "As senhas não correspondem. Por favor, digite-as novamente.");
        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private Image icone() {
            return new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imagens/icone.png")).getImage();
       }


    /**
    * @param args the command line arguments
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ano;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton cancelar;
    private javax.swing.JRadioButton casado;
    private javax.swing.JTextField cpf;
    private javax.swing.JComboBox dia;
    private javax.swing.ButtonGroup estCiv;
    private javax.swing.JRadioButton feminino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField login;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JComboBox mes;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField rg;
    private javax.swing.JPasswordField senha;
    private javax.swing.JPasswordField senhaConf;
    private javax.swing.JSeparator separador;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JRadioButton solteiro;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables

}
