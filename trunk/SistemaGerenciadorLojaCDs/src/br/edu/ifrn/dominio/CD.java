/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifrn.dominio;

/**
 *
 * @author 2007134010475
 */
public class CD {
    private int id;
    private int ano;
    private Genero gen;
    private Funcionario func;
    private String titulo;
    private String artista;
    private int duracao;
    private int numFaixas;
    private int quantidade;
    private boolean disponivel;
    private boolean lancamento;
    private double preco;

    public CD(int id, int ano, Genero gen, Funcionario func, String titulo, String artista, int duracao, int numFaixas, int quantidade, boolean disponivel, boolean lancamento, double preco) {
        this.id = id;
        this.ano = ano;
        this.gen = gen;
        this.func = func;
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.numFaixas = numFaixas;
        this.quantidade = quantidade;
        this.disponivel = disponivel;
        this.lancamento = lancamento;
        this.preco = preco;
    }
    
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getFunc() {
        return func.getLogin();
    }

    public String getGen() {
        return gen.getNome();
    }

    public void setGen(String gen) {
        this.gen.setNome(gen);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean isDisponivel) {
        this.disponivel = isDisponivel;
    }

    public boolean isLancamento() {
        return lancamento;
    }

    public void setLancamento(boolean isLancamento) {
        this.lancamento = isLancamento;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    

}
