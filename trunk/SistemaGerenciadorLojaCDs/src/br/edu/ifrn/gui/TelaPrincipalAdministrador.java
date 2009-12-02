/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaPrincipalAdministrador.java
 *
 * Created on 12/11/2009, 14:47:55
 */

package br.edu.ifrn.gui;


import br.edu.ifrn.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.Image;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 2007134010475
 */
public class TelaPrincipalAdministrador extends javax.swing.JFrame {

    /** Creates new form TelaPrincipalAdministrador */
    public TelaPrincipalAdministrador() {
        initComponents();
	    iniciaRelogio();//inicia o relógio
    }

    

    // Código para alterar o ícone da janela

       private Image icone() {
            return new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imagens/icone.png")).getImage();
       }
         
    // Fim do código para alterar o ícone da janela

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        logotipo = new javax.swing.JLabel();
        menurapido = new javax.swing.JPanel();
        realizarvenda = new javax.swing.JButton();
        pesquisarcd = new javax.swing.JButton();
        pesquisacliente = new javax.swing.JButton();
        cadastrarcd = new javax.swing.JButton();
        cadastrarcliente = new javax.swing.JButton();
        sac = new javax.swing.JButton();
        dataehora = new javax.swing.JPanel();
        dataHora = new javax.swing.JLabel();
        relogio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        opcaoTrocar = new javax.swing.JMenuItem();
        opcaoFinalizar = new javax.swing.JMenuItem();
        menuCadastrar = new javax.swing.JMenu();
        opcaoCliente = new javax.swing.JMenuItem();
        opcaoFuncionario = new javax.swing.JMenu();
        subOpcaoAdmin = new javax.swing.JMenuItem();
        subOpcaoVend = new javax.swing.JMenuItem();
        opcaoCD = new javax.swing.JMenuItem();
        menuVenda = new javax.swing.JMenu();
        opcaoRealizar = new javax.swing.JMenuItem();
        opcaoConsultar = new javax.swing.JMenuItem();
        menuSAC = new javax.swing.JMenu();
        opcaoLer = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        opcaoRelatorio = new javax.swing.JMenuItem();
        opcaoLerRel = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        opcaoSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Loja de CDs");
        setIconImage(icone());
        setResizable(false);

        jLabel1.setText("jLabel1");

        menurapido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Menu Rápido", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        realizarvenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        realizarvenda.setText("Realizar Venda");
        realizarvenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarvendaActionPerformed(evt);
            }
        });

        pesquisarcd.setFont(new java.awt.Font("Tahoma", 1, 12));
        pesquisarcd.setText("Pesquisar CD");

        pesquisacliente.setFont(new java.awt.Font("Tahoma", 1, 12));
        pesquisacliente.setText("Pesquisar Cliente");

        cadastrarcd.setFont(new java.awt.Font("Tahoma", 1, 12));
        cadastrarcd.setText("Cadastrar CD");

        cadastrarcliente.setFont(new java.awt.Font("Tahoma", 1, 12));
        cadastrarcliente.setText("Cadastrar Cliente");

        sac.setFont(new java.awt.Font("Tahoma", 1, 12));
        sac.setText("SAC");

        javax.swing.GroupLayout menurapidoLayout = new javax.swing.GroupLayout(menurapido);
        menurapido.setLayout(menurapidoLayout);
        menurapidoLayout.setHorizontalGroup(
            menurapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menurapidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menurapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(realizarvenda, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(pesquisarcd, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(pesquisacliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(cadastrarcd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(cadastrarcliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(sac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap())
        );
        menurapidoLayout.setVerticalGroup(
            menurapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menurapidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(realizarvenda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pesquisarcd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pesquisacliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cadastrarcd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cadastrarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        dataehora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        dataHora.setFont(new java.awt.Font("Tahoma", 1, 18));
        dataHora.setForeground(java.awt.Color.blue);
        /*
        dataHora.setText("00/00/0000");
        */
        dataHora.setText(formatter.format(data));

        relogio.setFont(new java.awt.Font("Tahoma", 1, 18));
        relogio.setForeground(java.awt.Color.blue);
        relogio.setText("00:00:00");

        javax.swing.GroupLayout dataehoraLayout = new javax.swing.GroupLayout(dataehora);
        dataehora.setLayout(dataehoraLayout);
        dataehoraLayout.setHorizontalGroup(
            dataehoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataehoraLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(dataHora)
                .addGap(16, 16, 16)
                .addComponent(relogio)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        dataehoraLayout.setVerticalGroup(
            dataehoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataehoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataehoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataHora)
                    .addComponent(relogio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imagens/telainicial.jpg"))); // NOI18N

        menuUsuario.setText("Usuário");

        opcaoTrocar.setText("Trocar");
        menuUsuario.add(opcaoTrocar);

        opcaoFinalizar.setText("Finalizar programa");
        menuUsuario.add(opcaoFinalizar);

        menu.add(menuUsuario);

        menuCadastrar.setText("Cadastro");

        opcaoCliente.setText("Cliente");
        menuCadastrar.add(opcaoCliente);

        opcaoFuncionario.setText("Funcionário");

        subOpcaoAdmin.setText("Administrador");
        opcaoFuncionario.add(subOpcaoAdmin);

        subOpcaoVend.setText("Vendedor");
        opcaoFuncionario.add(subOpcaoVend);

        menuCadastrar.add(opcaoFuncionario);

        opcaoCD.setText("CD");
        menuCadastrar.add(opcaoCD);

        menu.add(menuCadastrar);

        menuVenda.setText("Venda");

        opcaoRealizar.setText("Realizar");
        menuVenda.add(opcaoRealizar);

        opcaoConsultar.setText("Consultar");
        menuVenda.add(opcaoConsultar);

        menu.add(menuVenda);

        menuSAC.setText("SAC");

        opcaoLer.setText("Ler mensagens");
        menuSAC.add(opcaoLer);

        menu.add(menuSAC);

        menuRelatorio.setText("Relatório");

        opcaoRelatorio.setText("Gerar");
        menuRelatorio.add(opcaoRelatorio);

        opcaoLerRel.setText("Ler anteriores");
        menuRelatorio.add(opcaoLerRel);

        menu.add(menuRelatorio);

        menuAjuda.setText("Ajuda");

        opcaoSobre.setText("Sobre");
        menuAjuda.add(opcaoSobre);

        menu.add(menuAjuda);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menurapido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(logotipo))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataehora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logotipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataehora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(menurapido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void realizarvendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarvendaActionPerformed
       
    }//GEN-LAST:event_realizarvendaActionPerformed

    /**
    * @param args the command line arguments
    */

    private Date data = new Date();
    String formato = "dd/MM/yyyy";
    SimpleDateFormat formatter = new SimpleDateFormat(formato);
    

   
    
     


    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarcd;
    private javax.swing.JButton cadastrarcliente;
    private javax.swing.JLabel dataHora;
    private javax.swing.JPanel dataehora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel logotipo;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSAC;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenu menuVenda;
    private javax.swing.JPanel menurapido;
    private javax.swing.JMenuItem opcaoCD;
    private javax.swing.JMenuItem opcaoCliente;
    private javax.swing.JMenuItem opcaoConsultar;
    private javax.swing.JMenuItem opcaoFinalizar;
    private javax.swing.JMenu opcaoFuncionario;
    private javax.swing.JMenuItem opcaoLer;
    private javax.swing.JMenuItem opcaoLerRel;
    private javax.swing.JMenuItem opcaoRealizar;
    private javax.swing.JMenuItem opcaoRelatorio;
    private javax.swing.JMenuItem opcaoSobre;
    private javax.swing.JMenuItem opcaoTrocar;
    private javax.swing.JButton pesquisacliente;
    private javax.swing.JButton pesquisarcd;
    private javax.swing.JButton realizarvenda;
    private javax.swing.JLabel relogio;
    private javax.swing.JButton sac;
    private javax.swing.JMenuItem subOpcaoAdmin;
    private javax.swing.JMenuItem subOpcaoVend;
    // End of variables declaration//GEN-END:variables





    // label onde será impressa a hora atual


	// Thread responsável pelo relório

    public void iniciaRelogio(){
		new Thread(){//instancia nova thread já implementando o método run()
			@Override
			public void run() {//sobrescreve o método run()

				while(true){//while para fazer o loop infinito
					GregorianCalendar gc = new GregorianCalendar();//novo gregorian calendar, onde temos a data atual
					int hora = gc.get(Calendar.HOUR_OF_DAY);//pega as horas
					int minuto = gc.get(Calendar.MINUTE);//pega os minutos
					int segundo = gc.get(Calendar.SECOND);//pega os segundos
					String horaString;//nova string horas
					String minString;//nova string minutos
					String segundoString;//nova string segundos
					if(hora < 10){//se hora for menor que 10 precisa colocar um 0 à esquerda
						horaString = "0"+hora;
					}else{
						horaString = ""+hora;
					}
					if(minuto < 10){//se minuto for menor que 10 precisa colocar um 0 à esquerda
						minString = "0"+minuto;
					}else{
						minString = ""+minuto;
					}
					if(segundo < 10){//se segundo for menor que 10 precisa colocar um 0 à esquerda
						segundoString = "0"+segundo;
					}else{
						segundoString = ""+segundo;
					}
					relogio.setText(horaString+":"+minString+":"+segundoString);//seta hora atual no label
					try{
						sleep(1000);//faz a thread entrar em estado de espera por 1000 milissegundos ou 1 segundo
					}catch(Exception e){}
				}
			}
		}.start();//inicia a thread.
	}

}
