package com.example.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberComparatorTest {

    @Test
    void testFirstIsGreater() {
        assertEquals(NumberComparator.ComparisonResult.FIRST_IS_GREATER,
                NumberComparator.compare(10, 5));
    }

    @Test
    void testSecondIsGreater() {
        assertEquals(NumberComparator.ComparisonResult.SECOND_IS_GREATER,
                NumberComparator.compare(3, 7));
    }

    @Test
    void testEqual() {
        assertEquals(NumberComparator.ComparisonResult.EQUAL,
                NumberComparator.compare(4, 4));
    }
}