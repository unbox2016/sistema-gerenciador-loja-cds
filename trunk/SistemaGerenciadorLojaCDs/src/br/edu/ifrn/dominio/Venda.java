/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dominio;

/**
 *
 * @author 2007134010475
 */
public class Venda {
    private Cliente cli;
    private CD cd;
    private Vendedor vend;
    private int quantCdsVendidos;
    
    public int getCd() {
        return cd.getId();
    }

    public String getCli() {
        return cli.getCpf();
    }

    public double getPreco(){
        return cd.getPreco();
    }


    public String getCDName(){
        return cd.getTitulo();
    }

    public int getQuantCdsVendidos() {
        return quantCdsVendidos;
    }

    public void setQuantCdsVendidos(int quantCdsVendidos) {
        this.quantCdsVendidos = quantCdsVendidos;
    }

    public String getVend() {
        return vend.getLogin();
    }

   
    public Venda(Cliente cli, CD cd, Vendedor vend, int quantCdsVendidos) {
        this.cli = cli;
        this.cd = cd;
        this.vend = vend;
        this.quantCdsVendidos = quantCdsVendidos;
    }
    
}
