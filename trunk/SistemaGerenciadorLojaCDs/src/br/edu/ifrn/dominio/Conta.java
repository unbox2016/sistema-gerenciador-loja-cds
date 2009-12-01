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

    private int codigo;
    private float saldoTotal;
    private String cdComprado;
    private float preco;

    public Conta(CD cd, int cod){
        this.cd = cd;
        this.cdComprado = cd.getTitulo();
        this.preco = cd.getPreco();
        this.saldoTotal++;
        this.codigo = cod;
    }

    public float getSaldoTotal() {
        return this.saldoTotal;
    }

    public int getCodigo(){
        return this.codigo;
    }

}
