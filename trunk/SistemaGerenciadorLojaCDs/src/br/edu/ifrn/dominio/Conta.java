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

    private int codigo;
    private float saldoTotal = 0;

    public Conta(int codigo, float valor ){
        this.codigo = codigo;
        this.saldoTotal += valor;
    }

    public Conta(){
        this.codigo = 0;
        this.saldoTotal = 0;
    }

    public float getSaldoTotal() {
        return this.saldoTotal;
    }

    public int getCodigo(){
        return this.codigo;
    }

}
