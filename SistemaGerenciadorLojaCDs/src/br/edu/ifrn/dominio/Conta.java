/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dominio;

import java.util.Date;

/**
 *
 * @author Cliente
 */
public class Conta {
    private CD cd;

    private int codigo;
    private float saldoTotal;
    private String cdComprado;
    private double preco;
    private Date data;

    public Conta(CD cd, Date data ){
        this.cd = cd;
        this.cdComprado = cd.getTitulo();
        this.preco = cd.getPreco();
        this.saldoTotal++;
        this.data = data;
    }

    public Conta(int codigo, float saldoTotal){
    }

    public float getSaldoTotal() {
        return this.saldoTotal;
    }

    public int getCodigo(){
        return this.codigo;
    }

}
