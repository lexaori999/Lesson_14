package com.example.utils.testsNG;

import com.example.math.FactorialCalculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

    @DataProvider(name = "factorialData")
    public Object[][] factorialData() {
        return new Object[][]{
                {0, 1},  // 0! = 1
                {1, 1},  // 1! = 1
                {2, 2},  // 2! = 2
                {5, 120}, // 5! = 120
                {10, 3628800} // 10! = 3,628,800
        };
    }

    @Test(dataProvider = "factorialData")
    public void testFactorial(int input, long expected) {
        Assert.assertEquals(FactorialCalculator.factorial(input), expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegativeNumber() {
        FactorialCalculator.factorial(-5);
    }
}