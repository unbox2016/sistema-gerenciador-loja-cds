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
    private float duracao;
    private int numFaixas;
    private int quantidade;
    private boolean isDisponivel;
    private boolean isLancamento;
    private float preco;
    
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

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
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

    public boolean isIsDisponivel() {
        return isDisponivel;
    }

    public void setIsDisponivel(boolean isDisponivel) {
        this.isDisponivel = isDisponivel;
    }

    public boolean isIsLancamento() {
        return isLancamento;
    }

    public void setIsLancamento(boolean isLancamento) {
        this.isLancamento = isLancamento;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
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
    
    
    public CD(int id, int ano, Genero gen, Funcionario func, String titulo, String artista, float duracao, int numFaixas, int quantidade, boolean isDisponivel, boolean isLancamento, float preco) {
        this.id = id;
        this.ano = ano;
        this.gen = gen;
        this.func = func;
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.numFaixas = numFaixas;
        this.quantidade = quantidade;
        this.isDisponivel = isDisponivel;
        this.isLancamento = isLancamento;
        this.preco = preco;
    }
    

}
