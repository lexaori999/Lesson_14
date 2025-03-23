package com.example.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberComparatorTest {

    @Test
    @DisplayName("Сравнение 5 и 3 должно вернуть положительное число (5 > 3)")
    void testCompareGreaterThan() {
        assertTrue(NumberComparator.compare(5, 3) > 0, "5 больше 3");
    }

    @Test
    @DisplayName("Сравнение 3 и 5 должно вернуть отрицательное число (3 < 5)")
    void testCompareLessThan() {
        assertTrue(NumberComparator.compare(3, 5) < 0, "3 меньше 5");
    }

    @Test
    @DisplayName("Сравнение 5 и 5 должно вернуть 0 (5 == 5)")
    void testCompareEqual() {
        assertEquals(0, NumberComparator.compare(5, 5), "5 равно 5");
    }

    @Test
    @DisplayName("Сравнение отрицательных чисел (-5 и -10)")
    void testCompareNegativeNumbers() {
        assertTrue(NumberComparator.compare(-5, -10) > 0, "-5 больше -10");
        assertTrue(NumberComparator.compare(-10, -5) < 0, "-10 меньше -5");
    }
}