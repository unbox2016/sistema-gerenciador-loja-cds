/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dominio;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author 2007134010475
 */
public class Relatorio {
    Date data;
    Time hora;
    CD cd;
    Cliente cli;
    Administrador adm;
    Vendedor ven;
    int id;

    public Relatorio(Date data, Time hora, CD cd, Cliente cli, Administrador adm, Vendedor ven, int id) {
        this.data = data;
        this.hora = hora;
        this.cd = cd;
        this.cli = cli;
        this.adm = adm;
        this.ven = ven;
        this.id = id;
    }

    public Administrador getAdm() {
        return adm;
    }

    public void setAdm(Administrador adm) {
        this.adm = adm;
    }

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vendedor getVen() {
        return ven;
    }

    public void setVen(Vendedor ven) {
        this.ven = ven;
    }


    

}
