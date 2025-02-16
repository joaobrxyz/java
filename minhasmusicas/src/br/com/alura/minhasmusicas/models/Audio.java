package br.com.alura.minhasmusicas.models;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        this.totalCurtidas++;
    }
    public void reproduzir() {
        this.totalDeReproducoes++;
    }
}
