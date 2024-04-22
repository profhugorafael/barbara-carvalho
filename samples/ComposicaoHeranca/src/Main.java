import models.Arch;
import models.Archer;
import models.Character;
import models.Swordsman;
import org.w3c.dom.CDATASection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printCharacter(Character character) {
        // print character
    }

    public static void main(String[] args) {

        Arch arch1 = new Arch(10, 100);
        Arch arch2 = new Arch(12, 30);
//
//        Archer ac = new Archer(5, 7, 2, arch1, arch2);

        // casting - elenco
        var conta = (double) 1 / 2;

        // upcasting - menciono o objeto como sua classe mae
        Character c1 = new Archer(5, 7, 2, arch1, arch2);
        Character c2 = new Swordsman(10, 7, 4);

        // downcasting - menciono uma classe como sua classe filha
        Archer downcastToArcher = (Archer) c1;
        // Archer downcastToArcher2 = (Archer) c2; // not work

        List<Character> characters = new ArrayList<>();

        Number[] array = {1, 2, 3.4, 5.6};

        LocalDateTime.now().isBefore(LocalDateTime.now());

        characters.add(new Archer(5, 7, 2, arch1, arch2));

        downcastToArcher.sayHello();

        printCharacter(new Archer(5, 7, 2, arch1, arch2));

        List<Integer> lista = new ArrayList<>();


//        Archer ac = Archer.of(5, 7, 2,
//                10, 100,
//                12, 30);

        LocalDateTime moment = LocalDateTime.of(2024, 04, 22, 19, 49);



    }
}