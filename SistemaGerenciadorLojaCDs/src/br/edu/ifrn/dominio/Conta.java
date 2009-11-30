/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dominio;

/**
 *
 * @author Cliente
 */
public class Conta {
    private CD cd;

    private float saldoTotal;
    private String cdComprado;
    private float preco;

    public Conta(CD cd){
        this.cd = cd;
        this.cdComprado = cd.getTitulo();
        this.preco = cd.getPreco();
        this.saldoTotal++;
    }

    public float getSaldoTotal() {
        return saldoTotal;
    }
    



}
