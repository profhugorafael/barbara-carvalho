import exceptions.ScoreOutOfBoundsException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // throws = aressa (possibilidade)
    // throw new ... = arremesse (ordem)

    public static void calculateFinalGrade() throws ScoreOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);
        double score1 = scanner.nextDouble();
        double score2 = scanner.nextDouble();

        if (score1 < 0 || score1 > 10) {
            throw new ScoreOutOfBoundsException("score 1");
        }

        if (score2 < 0 || score2 > 10) {
            throw new ScoreOutOfBoundsException("score 2");
        }

        var finalScore = (score1 + score2) / 2;

        System.out.println("final grade = " + finalScore);
    }

    // trata
    // delega
    // cria

    public static void main(String[] args)  {
        // excecao = comportamento nao desejado porem esperado e possivelmente tratavel
        // erro = grave, geralmente nem da pra resolver

        try {
            calculateFinalGrade();
        } catch (ScoreOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
        System.out.println("restante do programa");
    }
}