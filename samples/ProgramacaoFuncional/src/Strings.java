import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Strings {

    public static boolean frutaIniciaComA(String nomeDaFruta) {
        return nomeDaFruta.startsWith("a");
    }

    public static void log(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("melon");
        fruits.add("banana");
        fruits.add("acerola");
        fruits.add("acai");

        Predicate<String> funcaoValidadora = Strings::frutaIniciaComA;
        Predicate<String> funcaoValidadora2 = fruit -> fruit.startsWith("a");

//        fruits.stream()
//            .filter(Strings::frutaIniciaComA)
//            .toList();

        fruits.stream()
            .filter(fruit -> fruit.startsWith("a"))
            .toList();

        fruits.stream()
                .filter(fruit -> {
                    return fruit.startsWith("a");
                })
                .toList();

        System.out.println(fruits.stream().allMatch((fruit) -> fruit.startsWith("z")));

        fruits.forEach(System.out::println);

        // map = conversor

        List<Integer> numberOfCharsOnEachFruit = fruits.stream()
                .map((fruit) -> fruit.length())
                .toList();

        numberOfCharsOnEachFruit.forEach(System.out::println);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        BinaryOperator<Integer> sum = (a, b) -> a + b;
        BiFunction<Integer, String, String> repete = (numero, texto) -> {
            String acc = "";

            for (int i = 0; i < numero; i++) {
                acc += texto;
            }

            return acc;
        };

        int total = numbers.stream().reduce(0, (acc, number) -> acc + number);

        System.out.println(fruits.stream().reduce("", (acc, fruit) -> acc + ", " + fruit));;
    }
}
