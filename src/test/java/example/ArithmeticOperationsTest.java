package com.example.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperationsTest {

    @Test
    @DisplayName("Сложение: 3 + 4 должно быть 7")
    void testAddition() {
        assertEquals(7, ArithmeticOperations.add(4, 4), "3 + 4 должно быть 7");
    }

    @Test
    @DisplayName("Вычитание: 10 - 5 должно быть 5")
    void testSubtraction() {
        assertEquals(5, ArithmeticOperations.subtract(10, 5), "10 - 5 должно быть 5");
    }

    @Test
    @DisplayName("Умножение: 6 * 7 должно быть 42")
    void testMultiplication() {
        assertEquals(42, ArithmeticOperations.multiply(6, 7), "6 * 7 должно быть 42");
    }

    @Test
    @DisplayName("Деление: 10 / 2 должно быть 5.0")
    void testDivision() {
        assertEquals(5.0, ArithmeticOperations.divide(10, 2), "10 / 2 должно быть 5.0");
    }

    @Test
    @DisplayName("Деление на 0 должно вызывать исключение")
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(5, 0), "Деление на 0 должно вызывать исключение");
    }
}