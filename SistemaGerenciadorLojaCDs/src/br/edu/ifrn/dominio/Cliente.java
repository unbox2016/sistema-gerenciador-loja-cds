/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dominio;

import java.util.Date;

/**
 *
 * @author 2007134010475
 */
public class Cliente {
    private String cpf;
    private Funcionario func;
    private String rg;
    private String nome;
    private String sexo;
    private String telefone;
    private String estCivil;
    private Date dataNasc;
    private Conta conta;

    public Cliente(String cpf, Funcionario func, String rg, String nome, String sexo, String telefone, String estCivil, Date dataNasc, Conta conta) {
        this.cpf = cpf;
        this.func = func;
        this.rg = rg;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.estCivil = estCivil;
        this.dataNasc = dataNasc;
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    

}
