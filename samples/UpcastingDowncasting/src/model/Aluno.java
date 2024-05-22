package model;

public class Aluno extends Pessoa {

    private String ra;
    private double nota;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, int idade, String ra, double nota) {
        super(nome, cpf, idade);
        this.ra = ra;
        this.nota = nota;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
