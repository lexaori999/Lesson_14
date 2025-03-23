package com.example.utils.testsNG;

import com.example.math.ArithmeticOperations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArithmeticOperationsTest {

    @DataProvider(name = "additionData")
    public Object[][] additionData() {
        return new Object[][]{
                {3, 5, 8},
                {-3, 5, 2},
                {0, 0, 0},
                {-7, -3, -10}
        };
    }

    @Test(dataProvider = "additionData")
    public void testAdd(int a, int b, int expected) {
        Assert.assertEquals(ArithmeticOperations.add(a, b), expected);
    }

    @DataProvider(name = "subtractionData")
    public Object[][] subtractionData() {
        return new Object[][]{
                {5, 3, 2},
                {3, 5, -2},
                {0, 0, 0},
                {-7, -3, -4}
        };
    }

    @Test(dataProvider = "subtractionData")
    public void testSubtract(int a, int b, int expected) {
        Assert.assertEquals(ArithmeticOperations.subtract(a, b), expected);
    }

    @DataProvider(name = "multiplicationData")
    public Object[][] multiplicationData() {
        return new Object[][]{
                {3, 5, 15},
                {-3, 5, -15},
                {0, 10, 0},
                {-7, -3, 21}
        };
    }

    @Test(dataProvider = "multiplicationData")
    public void testMultiply(int a, int b, int expected) {
        Assert.assertEquals(ArithmeticOperations.multiply(a, b), expected);
    }

    @DataProvider(name = "divisionData")
    public Object[][] divisionData() {
        return new Object[][]{
                {10, 2, 5.0},
                {7, 2, 3.5},
                {-9, 3, -3.0},
                {-8, -2, 4.0}
        };
    }

    @Test(dataProvider = "divisionData")
    public void testDivide(int a, int b, double expected) {
        Assert.assertEquals(ArithmeticOperations.divide(a, b), expected, 0.0001);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        ArithmeticOperations.divide(5, 0);
    }
}