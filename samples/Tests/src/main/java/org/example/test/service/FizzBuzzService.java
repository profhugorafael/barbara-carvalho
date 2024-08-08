package org.example.test.service;

public class FizzBuzzService {

    public String generate(int number) {
        String aux = "";

        if(number % 3 == 0)
           aux += "Fizz";

        if(number % 5 == 0)
           aux += "Buzz";

        return aux;
    }

}
