package com.example.utils.testsNG;

import com.example.math.TriangleAreaCalculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TriangleAreaCalculatorTest {

    @DataProvider(name = "triangleAreaData")
    public Object[][] triangleAreaData() {
        return new Object[][]{
                {10, 5, 25.0},
                {3, 6, 9.0},
                {7, 2, 7.0},
                {4.5, 3.2, 7.2}
        };
    }

    @Test(dataProvider = "triangleAreaData")
    public void testCalculateArea(double base, double height, double expected) {
        Assert.assertEquals(TriangleAreaCalculator.calculateArea(base, height), expected, 0.0001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeBase() {
        TriangleAreaCalculator.calculateArea(-5, 10);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeHeight() {
        TriangleAreaCalculator.calculateArea(5, -10);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testZeroBase() {
        TriangleAreaCalculator.calculateArea(0, 10);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testZeroHeight() {
        TriangleAreaCalculator.calculateArea(10, 0);
    }
}