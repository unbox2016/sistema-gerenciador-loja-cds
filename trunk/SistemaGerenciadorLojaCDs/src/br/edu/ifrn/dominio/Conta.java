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
    private float saldoTotal = 0;
    private String cdComprado;
    private double preco;

    public Conta(CD cd, float valor ){
        this.cd = cd;
        this.cdComprado = cd.getTitulo();
        this.preco = cd.getPreco();
        this.saldoTotal += valor;
    }

    public Conta(){
        this.codigo = 0;
        this.saldoTotal = 0;
    }
    
    public int getCDID(){
        return cd.getId();
    }

    public float getSaldoTotal() {
        return this.saldoTotal;
    }

    public int getCodigo(){
        return this.codigo;
    }

}
