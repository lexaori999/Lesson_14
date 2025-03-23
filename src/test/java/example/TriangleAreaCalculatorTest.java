package com.example.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaCalculatorTest {

    @Test
    @DisplayName("Площадь треугольника с основанием 4 и высотой 5 должна быть 10")
    void testCalculateArea() {
        assertEquals(10.0, TriangleAreaCalculator.calculateArea(4, 5), "Площадь треугольника должна быть 10");
    }

    @Test
    @DisplayName("Отрицательные значения должны вызывать исключение")
    void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculateArea(-5, 10), "Нельзя использовать отрицательные числа");
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculateArea(5, -10), "Нельзя использовать отрицательные числа");
    }

    @Test
    @DisplayName("Основание или высота 0 должны вызывать исключение")
    void testZeroInput() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculateArea(0, 5), "Основание не может быть 0");
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculateArea(5, 0), "Высота не может быть 0");
    }
}