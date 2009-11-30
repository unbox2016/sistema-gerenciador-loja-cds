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
public class Vendedor extends Funcionario {
    public Vendedor(String log, String sen, String nom, String sex, String tel, String estciv, String cpf, String rg, Date nasc, boolean isAdm){
        super(log,sen,nom,sex,tel,estciv,cpf,rg,nasc, false);
   }
}
