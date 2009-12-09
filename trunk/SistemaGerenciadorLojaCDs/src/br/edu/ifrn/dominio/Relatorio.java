/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dominio;

import java.sql.Time;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author 2007134010475
 */
public class Relatorio {
    Date data;
    Date hora;
    CD cd;
    Cliente cli;
    Administrador adm;
    Vendedor ven;
    Faturamento fat;

    public Relatorio(Date data, Time hora, CD cd, Cliente cli, Administrador adm, Vendedor ven, Faturamento fat) {
        this.data = data;
        this.hora = hora;
        this.cd = cd;
        this.cli = cli;
        this.adm = adm;
        this.ven = ven;
        this.fat = fat;
    }

    public int getFat() {
        return fat.getId();
    }

    public void setFat(Faturamento fat) {
        this.fat = fat;
    }

    public String getAdm() {
        return adm.getLogin();
    }

    public void setAdm(Administrador adm) {
        this.adm = adm;
    }

    public int getCd() {
        return cd.getId();
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

    public String getCli() {
        return cli.getCpf();
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

    public Date getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getVen() {
        return ven.getLogin();
    }

    public void setVen(Vendedor ven) {
        this.ven = ven;
    }


    

}
