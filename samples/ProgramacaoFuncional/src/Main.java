import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static boolean comecaComA(String text) {
        return text.startsWith("A");
    }

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(11); // 0
        numeros.add(22); // 1
        numeros.add(33); // 2
        numeros.add(44); // 3
        numeros.add(55); // 4

        // programacao funcional = variaveis poderem guardar funcoes
        // na programacao funcional funcoes podem ser passadas como parametros

        // predicate<T> = (T) -> boolean

        Predicate<Integer> ehPositivo = numero -> numero > 0;
        Predicate<String> comecaComAPredicate = Main::comecaComA;

        Function<String, Boolean> r = (texto) -> texto.length() > 5;
        // function<T, R> = (T) -> (R)

        // consumer<T> = (T) -> void

        numeros.forEach(z -> {
            System.out.println("----");
            System.out.println(z);
            System.out.println("----");
        });

        List<Integer> impares = numeros.stream()
                .filter(numero -> numero%2 == 1)
                .toList();

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Pedro", 23, 1.8, 'M'));
        pessoas.add(new Pessoa("Alice", 27, 1.7, 'F'));
        pessoas.add(new Pessoa("Beatriz", 32, 1.6, 'F'));
        pessoas.add(new Pessoa("Joao", 16, 1.6, 'M'));

        pessoas.stream()
               .filter(pessoa -> pessoa.getIdade() >= 18)
               .filter(pessoa -> pessoa.getSexo() == 'F')
               .forEach(System.out::println);

        // forEach -> passo pelos elementos, faco algo, e valeu
        // map -> passo pelos elementos, faco algo, e transformo o elemento
        List<Integer> resultado = pessoas.stream()
                .map(pessoa -> pessoa.getIdade())
                .toList();

        List<User> users = new ArrayList<>();
        users.add(new User("Bob", "bob@gmail.com", "1234"));
        users.add(new User("alice", "alice@gmail.com", "1234"));
        users.add(new User("martha", "martha@gmail.com", "1234"));
        users.add(new User("alex", "alex@gmail.com", "1234"));

        users.stream()
            .map(user -> new Perfil(user.getName(), user.getEmail()))
            .forEach(perfil -> System.out.println(perfil));
    }

}
