package model;

public class Musica extends Midia {

    private int duracaoSegundos;
    private String nomeArtista;

    public Musica() {
    }

    public Musica(String nome, String categoria, String nomeArtista, int duracaoSegundos) {
        super(nome, categoria);
        this.nomeArtista = nomeArtista;
        this.duracaoSegundos = duracaoSegundos;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }


    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo musica... " + nome);
    }

    @Override
    public String toString() {
        return super.toString()
                + "Artista(s): " + nomeArtista + ", Duracao: " + duracaoSegundos + "segundos";
    }
}
