package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calc = new Calculator();
    @Test void testAll() {
        assertAll(
            () -> assertEquals(5, calc.add(2, 3)),
            () -> assertEquals(10, calc.multiply(2, 5)),
            () -> assertEquals(2.5, calc.divide(5, 2)),
            () -> assertThrows(ArithmeticException.class, () -> calc.divide(5, 0))
        );
    }
}