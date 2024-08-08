package org.example.test.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzServiceTest {

    @Test
    public void ShouldReturnFizzWhenMultipleOfThree() {
        int number = 9;
        String expectedResult = "Fizz";

        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        String result = fizzBuzzService.generate(number);

        assertEquals(expectedResult, result);
    }

    @Test
    public void ShouldReturnBuzzWhenMultipleOfFive() {
        int number = 25;
        String expectedResult = "Buzz";

        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        String result = fizzBuzzService.generate(number);

        assertEquals(expectedResult, result);
    }

    @Test
    public void ShouldReturnFizzBuzzWhenMultipleOfThreeAndFive() {
        int number = 15;
        String expectedResult = "FizzBuzz";

        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        String result = fizzBuzzService.generate(number);

        assertEquals(expectedResult, result);
    }
}
