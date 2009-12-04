/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dominio;

/**
 *
 * @author 2007134010475
 */
public class Faturamento {

    int id;
    int quantCDs;
    CD cd;
    Cliente cli;
    Funcionario func;

    public void setId(int id) {
        this.id = id;
    }
    

    public int getCd() {
        return cd.getId();
    }

    public int getQuantCDs() {
        return quantCDs;
    }

    public String getCli() {
        return cli.getCpf();
    }

    public String getFunc() {
        return func.getLogin();
    }

    public int getId() {
        return id;
    }
    
    public Faturamento(int id, CD cd, Cliente cli, Funcionario func) {
        this.id = id;
        this.cd = cd;
        this.cli = cli;
        this.func = func;
        this.quantCDs++;
    }
    
}
