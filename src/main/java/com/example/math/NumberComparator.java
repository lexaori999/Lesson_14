package com.example.math;

public class NumberComparator {
    public enum ComparisonResult {
        FIRST_IS_GREATER, SECOND_IS_GREATER, EQUAL
    }

    public static ComparisonResult compare(int a, int b) {
        if (a > b) return ComparisonResult.FIRST_IS_GREATER;
        if (a < b) return ComparisonResult.SECOND_IS_GREATER;
        return ComparisonResult.EQUAL;
    }
}