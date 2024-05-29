package model;

public class Filme extends Midia {

    private int duracaoMinutos;
    private double avaliacao;
    private String autor;

    public Filme() {
    }

    public Filme(String nome, String categoria, int duracaoMinutos, double avaliacao, String autor) {
        super(nome, categoria);
        this.duracaoMinutos = duracaoMinutos;
        this.avaliacao = avaliacao;
        this.autor = autor;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo filme... " + nome);
    }

    @Override
    public String toString() {
        return super.toString()
                + "Autor(es): " + autor
                + ", Avaliação: " + avaliacao
                + ", Duracao: " + duracaoMinutos + "min";
    }
}
