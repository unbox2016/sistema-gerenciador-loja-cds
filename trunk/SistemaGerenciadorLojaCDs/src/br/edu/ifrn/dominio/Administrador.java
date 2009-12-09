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
// Um administrador é um funcionário, logo herda de tal classe
public class Administrador extends Funcionario {
   public Administrador(String log, String sen, String nom, String sex, String tel, String estciv, String cpf, String rg, Date nasc){
        super(log,sen,nom, cpf,rg,nasc, sex,tel,estciv, true);
   }
}
