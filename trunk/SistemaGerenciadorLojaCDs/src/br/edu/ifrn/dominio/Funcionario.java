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
public class Funcionario {

    protected String login;
    protected String senha;
    protected String nome;
    protected String sexo;
    protected String telefone;
    protected String estCivil;
    protected String cpf;
    protected String rg;
    protected Date DNascimento;
    protected boolean isAdm;

    public Funcionario(String login, String senha, String nome, String cpf, String rg, Date DNascimento, String sexo, String telefone, String estCivil,  boolean isAdm) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.estCivil = estCivil;
        this.cpf = cpf;
        this.rg = rg;
        this.DNascimento = DNascimento;
        this.isAdm = isAdm;
    }

    

    public Date getDNascimento() {
        return DNascimento;
    }

    public void setDNascimento(Date DNascimento) {
        this.DNascimento = DNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public boolean isIsAdm() {
        return isAdm;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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