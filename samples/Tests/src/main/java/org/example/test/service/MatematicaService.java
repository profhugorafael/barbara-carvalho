package org.example.test.service;

public class MatematicaService {

    public double sum(double a, double b) {
        return a + b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isPrime(int number) {
        // 2 ... number-1
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
