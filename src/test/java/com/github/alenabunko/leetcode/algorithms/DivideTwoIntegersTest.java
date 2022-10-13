package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTwoIntegersTest {

    DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();

    @Test
    void testDifferentValuesOfDividendsAndDivisors() {

        assertEquals(3, divideTwoIntegers.divide(10, 3));
        assertEquals(-2, divideTwoIntegers.divide(7, -3));
        assertEquals(1073741823, divideTwoIntegers.divide(2147483647, 2));
        assertEquals(715827882, divideTwoIntegers.divide(-2147483648, -3));
        assertEquals(-2147483648, divideTwoIntegers.divide(-2147483648, 1));
        assertEquals(2147483647, divideTwoIntegers.divide(-2147483648, -1));
        assertEquals(0, divideTwoIntegers.divide(1038925803, -2147483648));
        assertEquals(-1, divideTwoIntegers.divide(-1, 1));
        assertEquals(1, divideTwoIntegers.divide(-1, -1));
        assertEquals(-1073741824, divideTwoIntegers.divide(-2147483648, 2));
        assertEquals(-77, divideTwoIntegers.divide(-231, 3));
        assertEquals(-17, divideTwoIntegers.divide(-2147483648, 122481295));
    }
}