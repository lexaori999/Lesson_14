package com.example.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    @DisplayName("Факториал числа 5 должен быть 120")
    void testFactorialOfFive() {
        assertEquals(120, FactorialCalculator.factorial(5), "5! должно быть 120");
    }

    @Test
    @DisplayName("Факториал числа 0 должен быть 1")
    void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0), "0! должно быть 1");
    }

    @Test
    @DisplayName("Факториал отрицательного числа должен вызывать исключение")
    void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-3), "Факториал отрицательного числа не определен");
    }

    @Test
    @DisplayName("Факториал числа 1 должен быть 1")
    void testFactorialOfOne() {
        assertEquals(1, FactorialCalculator.factorial(1), "1! должно быть 1");
    }
}