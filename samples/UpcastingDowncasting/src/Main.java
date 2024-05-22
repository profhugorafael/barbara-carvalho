import model.Aluno;
import model.Funcionario;
import model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //upcasting cria um objeto e menciona ele como sua classe mae
        Pessoa p1 = new Aluno("Pedro", "111.22", 25,"123-3b", 7.2);
        Pessoa p2 = new Funcionario("Lucas", "222.33", 32, 5000);

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(new Aluno("Alice", "111.23", 27,"123-3b", 7.2));
    }
}