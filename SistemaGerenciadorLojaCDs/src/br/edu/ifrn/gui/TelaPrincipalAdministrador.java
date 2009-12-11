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


import br.edu.ifrn.dominio.Funcionario;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



/**
 *
 * @author 2007134010475
 */
public class TelaPrincipalAdministrador extends javax.swing.JFrame {

    /** Creates new form TelaPrincipalAdministrador */
    public TelaPrincipalAdministrador(Funcionario f) {
        func = f;
        initComponents();
	    iniciaRelogio();//inicia o relógio
    }

    Funcionario func;

    

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
        gerenciar = new javax.swing.JMenu();
        gerenciarCD = new javax.swing.JMenuItem();
        gerenciarFunc = new javax.swing.JMenuItem();
        gerenciarCliente = new javax.swing.JMenuItem();
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

        realizarvenda.setFont(new java.awt.Font("Tahoma", 1, 12));
        realizarvenda.setText("Realizar Venda");
        realizarvenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarvendaActionPerformed(evt);
            }
        });

        pesquisarcd.setFont(new java.awt.Font("Tahoma", 1, 12));
        pesquisarcd.setText("Pesquisar CD");
        pesquisarcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarcdActionPerformed(evt);
            }
        });

        pesquisacliente.setFont(new java.awt.Font("Tahoma", 1, 12));
        pesquisacliente.setText("Pesquisar Cliente");
        pesquisacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaclienteActionPerformed(evt);
            }
        });

        cadastrarcd.setFont(new java.awt.Font("Tahoma", 1, 12));
        cadastrarcd.setText("Cadastrar CD");
        cadastrarcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarcdActionPerformed(evt);
            }
        });

        cadastrarcliente.setFont(new java.awt.Font("Tahoma", 1, 12));
        cadastrarcliente.setText("Cadastrar Cliente");
        cadastrarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarclienteActionPerformed(evt);
            }
        });

        sac.setFont(new java.awt.Font("Tahoma", 1, 12));
        sac.setText("SAC");
        sac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacActionPerformed(evt);
            }
        });

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
                .addContainerGap(18, Short.MAX_VALUE))
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
        menuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuarioActionPerformed(evt);
            }
        });

        opcaoTrocar.setText("Trocar");
        opcaoTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoTrocarActionPerformed(evt);
            }
        });
        menuUsuario.add(opcaoTrocar);

        opcaoFinalizar.setText("Finalizar programa");
        opcaoFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoFinalizarActionPerformed(evt);
            }
        });
        menuUsuario.add(opcaoFinalizar);

        menu.add(menuUsuario);

        menuCadastrar.setText("Cadastro");

        opcaoCliente.setText("Cliente");
        opcaoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoClienteActionPerformed(evt);
            }
        });
        menuCadastrar.add(opcaoCliente);

        opcaoFuncionario.setText("Funcionário");

        subOpcaoAdmin.setText("Administrador");
        subOpcaoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subOpcaoAdminActionPerformed(evt);
            }
        });
        opcaoFuncionario.add(subOpcaoAdmin);

        subOpcaoVend.setText("Vendedor");
        subOpcaoVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subOpcaoVendActionPerformed(evt);
            }
        });
        opcaoFuncionario.add(subOpcaoVend);

        menuCadastrar.add(opcaoFuncionario);

        opcaoCD.setText("CD");
        opcaoCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoCDActionPerformed(evt);
            }
        });
        menuCadastrar.add(opcaoCD);

        menu.add(menuCadastrar);

        gerenciar.setText("Gerenciar");

        gerenciarCD.setText("CD");
        gerenciarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarCDActionPerformed(evt);
            }
        });
        gerenciar.add(gerenciarCD);

        gerenciarFunc.setText("Funcionário");
        gerenciarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarFuncActionPerformed(evt);
            }
        });
        gerenciar.add(gerenciarFunc);

        gerenciarCliente.setText("Cliente");
        gerenciarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarClienteActionPerformed(evt);
            }
        });
        gerenciar.add(gerenciarCliente);

        menu.add(gerenciar);

        menuVenda.setText("Venda");

        opcaoRealizar.setText("Realizar");
        opcaoRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoRealizarActionPerformed(evt);
            }
        });
        menuVenda.add(opcaoRealizar);

        opcaoConsultar.setText("Consultar");
        opcaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoConsultarActionPerformed(evt);
            }
        });
        menuVenda.add(opcaoConsultar);

        menu.add(menuVenda);

        menuSAC.setText("SAC");

        opcaoLer.setText("Ler mensagens");
        opcaoLer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoLerActionPerformed(evt);
            }
        });
        menuSAC.add(opcaoLer);

        menu.add(menuSAC);

        menuRelatorio.setText("Relatório");

        opcaoRelatorio.setText("Gerar");
        opcaoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoRelatorioActionPerformed(evt);
            }
        });
        menuRelatorio.add(opcaoRelatorio);

        opcaoLerRel.setText("Ler anteriores");
        opcaoLerRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoLerRelActionPerformed(evt);
            }
        });
        menuRelatorio.add(opcaoLerRel);

        menu.add(menuRelatorio);

        menuAjuda.setText("Ajuda");

        opcaoSobre.setText("Sobre");
        opcaoSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoSobreActionPerformed(evt);
            }
        });
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(dataehora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(menurapido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Venda v = new Venda();
    private void realizarvendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarvendaActionPerformed
       v.setVisible(true);
    }//GEN-LAST:event_realizarvendaActionPerformed

    PesquisaCD pcd = new PesquisaCD();
    private void pesquisarcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarcdActionPerformed
        pcd.setVisible(true);
    }//GEN-LAST:event_pesquisarcdActionPerformed

    PesquisaCliente pcli = new PesquisaCliente();
    private void pesquisaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaclienteActionPerformed
        pcli.setVisible(true);
    }//GEN-LAST:event_pesquisaclienteActionPerformed

    CadastroCD cadcd = new CadastroCD(func);
    private void cadastrarcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarcdActionPerformed
        cadcd.setVisible(true);
    }//GEN-LAST:event_cadastrarcdActionPerformed

    CadastroCliente cadcli = new CadastroCliente(func);
    private void cadastrarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarclienteActionPerformed
        cadcli.setVisible(true);
    }//GEN-LAST:event_cadastrarclienteActionPerformed

    SACListaMensagens saclist = new SACListaMensagens();
    private void sacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacActionPerformed
        saclist.setVisible(true);
    }//GEN-LAST:event_sacActionPerformed

     TelaLogin tl = new TelaLogin();
    private void opcaoTrocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoTrocarActionPerformed
        this.setDefaultCloseOperation(1);
        tl.setVisible(true);
    }//GEN-LAST:event_opcaoTrocarActionPerformed

    private void opcaoFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoFinalizarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opcaoFinalizarActionPerformed

    private void opcaoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoClienteActionPerformed
        cadcli.setVisible(true);
    }//GEN-LAST:event_opcaoClienteActionPerformed

    private void opcaoCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoCDActionPerformed
        cadcd.setVisible(true);
    }//GEN-LAST:event_opcaoCDActionPerformed

    CadastroAdministrador cadm = new CadastroAdministrador();
    private void subOpcaoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subOpcaoAdminActionPerformed
        cadm.setVisible(true);
    }//GEN-LAST:event_subOpcaoAdminActionPerformed

    CadastroVendedor cvend = new CadastroVendedor(func);
    private void subOpcaoVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subOpcaoVendActionPerformed
        cvend.setVisible(true);
    }//GEN-LAST:event_subOpcaoVendActionPerformed

    private void opcaoRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoRealizarActionPerformed
        v.setVisible(true);
    }//GEN-LAST:event_opcaoRealizarActionPerformed

    ListaVendas lv = new ListaVendas();
    private void opcaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoConsultarActionPerformed
        lv.setVisible(true);
    }//GEN-LAST:event_opcaoConsultarActionPerformed

    private void opcaoLerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoLerActionPerformed
        saclist.setVisible(true);
    }//GEN-LAST:event_opcaoLerActionPerformed

    Relatorio r = new Relatorio();
    private void opcaoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoRelatorioActionPerformed
        r.setVisible(true);
    }//GEN-LAST:event_opcaoRelatorioActionPerformed

    DataRelatorio dp = new DataRelatorio();
    private void opcaoLerRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoLerRelActionPerformed
        dp.setVisible(true);
    }//GEN-LAST:event_opcaoLerRelActionPerformed

    Sobre s = new Sobre();
    private void opcaoSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoSobreActionPerformed
        s.setVisible(true);
    }//GEN-LAST:event_opcaoSobreActionPerformed

    private void menuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuUsuarioActionPerformed
GerenciarCD g = new GerenciarCD();
    private void gerenciarCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarCDActionPerformed
        g.setVisible(true);
}//GEN-LAST:event_gerenciarCDActionPerformed
GerenciarFuncionario g2 = new GerenciarFuncionario();
    private void gerenciarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarFuncActionPerformed
        g2.setVisible(true);
    }//GEN-LAST:event_gerenciarFuncActionPerformed
GerenciarCliente g3 = new GerenciarCliente();
    private void gerenciarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarClienteActionPerformed
        g3.setVisible(true);
    }//GEN-LAST:event_gerenciarClienteActionPerformed

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
    private javax.swing.JMenu gerenciar;
    private javax.swing.JMenuItem gerenciarCD;
    private javax.swing.JMenuItem gerenciarCliente;
    private javax.swing.JMenuItem gerenciarFunc;
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

