import model.Filme;
import model.Midia;
import model.Musica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void showMenu() {
        System.out.println("1 - para cadastrar uma musica");
        System.out.println("2 - para cadastrar um filme");
        System.out.println("3 - para listar todos");
        System.out.println("4 - para listar musicas");
        System.out.println("5 - para listar filmes");
        System.out.println("0 - para sair");
        System.out.print("Digite sua opcao > ");
    }

    public static void cadastrarMusica(List<Midia> midias) {
        // solicitar campos da musica
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de Musica");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();

        System.out.print("Artista: ");
        String artista = scanner.nextLine();

        System.out.print("Duracao em segundos: ");
        int duracaoSegundos = scanner.nextInt();
        scanner.nextLine();

        // criar a musica
        Musica musica = new Musica(nome, categoria, artista, duracaoSegundos);

        // cadastrar a musica
        midias.add(musica);
    }

    public static void cadastrarFilme(List<Midia> midias) {
        // solicitar campos do filme
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de Filme");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Duracao em minutos: ");
        int duracaoMinutos = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Avaliacao (0.0 -> 10.0): ");
        double avaliacao = scanner.nextDouble();
        scanner.nextLine();

        // criar o filme
        Filme filme = new Filme(nome, categoria,duracaoMinutos, avaliacao, autor);

        // cadastrar a musica
        midias.add(filme);
    }

    public static void apresentaTodasAsMidias(List<? extends Midia> midias) {
        System.out.println("---------------------------------");

        if(midias.isEmpty()) {
            System.out.println("Nao há midias cadastradas");
            System.out.println("---------------------------------");
            return;
        }

        System.out.println(midias.get(0));

        for(Midia midia : midias.subList(1, midias.size())) {
            System.out.println("-");
            System.out.println(midia);
        }

        System.out.println("---------------------------------");

    }

    public static void apresentaTodosOsFilmes(List<Midia> midias) {
        List<Filme> filmes = new ArrayList<>();

        for(Midia midia : midias) {
            if (midia instanceof Filme filme)
                filmes.add(filme);
        }

        apresentaTodasAsMidias(filmes);
    }

    public static void apresentaTodosOsMusicas(List<Midia> midias) {
        List<Musica> musicas = new ArrayList<>();

        for(Midia midia : midias) {
            if (midia instanceof Musica musica)
                musicas.add(musica);
        }

        apresentaTodasAsMidias(musicas);
    }

    public static void main(String[] args) {

        List<Midia> midias = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            showMenu();
            option = scanner.nextInt();

            if(option == 0) break;

            switch (option) {
                case 1 -> cadastrarMusica(midias);
                case 2 -> cadastrarFilme(midias);
                case 3 -> apresentaTodasAsMidias(midias);
                case 4 -> {}
                case 5 -> {}
                default -> System.err.println("Digite uma opcao valida!");
            }
        } while(true);

    }
}