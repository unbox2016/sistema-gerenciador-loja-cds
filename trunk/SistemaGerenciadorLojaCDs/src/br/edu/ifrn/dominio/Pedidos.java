/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dominio;

/**
 *
 * @author 2007134010475
 */
public class Pedidos {
    int codigo;
    String conteudo;
    Cliente cli;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }



    public Pedidos(int codigo, Cliente cli, String conteudo) {
        this.codigo = codigo;
        this.cli = cli;
        this.conteudo = conteudo;
    }

    public String getCli() {
        return cli.getCpf();
    }
    
}
