package org.example.test.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MatematicaServiceTest {

    // When Returns - quando... retorna...
    // Should - deveria
    private static MatematicaService matematicaService;

    @BeforeAll
    public static void initialize() {
        matematicaService = new MatematicaService();
    }

    @ParameterizedTest(name = "testing sum")
    @CsvSource({
            "2, 3, 5",
            "4, 5, 9",
            "5, 6, 11",
            "7, 0, 7"
    })
    public void ShouldReturnSumOfTwoNumbers(double firstNumber, double secondNumber, double expectedResult) {
        // Given when Then
        // Arrange Act Assert

        // act / when
        double result = matematicaService.sum(firstNumber, secondNumber);

        // assert / then
        assertEquals(result, expectedResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    public void ShouldReturnTrueForEvenNumbers(int number) {
        boolean result = matematicaService.isEven(number);

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7}) // Odd numbers
    public void shouldReturnFalseForOddNumbers(int number) {
        boolean result = matematicaService.isEven(number);

        assertFalse(result);
    }
}
