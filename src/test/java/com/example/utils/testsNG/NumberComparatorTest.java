package com.example.utils.testsNG;

import com.example.math.NumberComparator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NumberComparatorTest {

    @DataProvider(name = "comparisonData")
    public Object[][] comparisonData() {
        return new Object[][]{
                {5, 3, NumberComparator.ComparisonResult.FIRST_IS_GREATER},
                {3, 5, NumberComparator.ComparisonResult.SECOND_IS_GREATER},
                {5, 5, NumberComparator.ComparisonResult.EQUAL},
                {7, 7, NumberComparator.ComparisonResult.EQUAL},
                {10, 2, NumberComparator.ComparisonResult.FIRST_IS_GREATER}
        };
    }

    @Test(dataProvider = "comparisonData")
    public void testCompare(int a, int b, NumberComparator.ComparisonResult expected) {
        Assert.assertEquals(NumberComparator.compare(a, b), expected);
    }
}