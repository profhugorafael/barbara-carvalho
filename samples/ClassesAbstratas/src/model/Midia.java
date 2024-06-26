package model;

public abstract class Midia implements Reproduzivel {

    protected String nome;
    protected String categoria;

    public Midia() {
    }

    public Midia(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " (Categoria: " + categoria + ")\n";
    }
}
