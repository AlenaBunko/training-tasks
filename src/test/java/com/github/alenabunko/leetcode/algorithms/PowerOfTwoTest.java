package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {
    PowerOfTwo pow = new PowerOfTwo();

    @Test
    void testDifferentDigits() {
        int n = -125489;
        assertFalse(pow.isPowerOfTwo(n));

        n = 0;
        assertFalse(pow.isPowerOfTwo(n));

        n = 1;
        assertTrue(pow.isPowerOfTwo(n));

        n = 8;
        assertTrue(pow.isPowerOfTwo(n));

        n = 1512;
        assertFalse(pow.isPowerOfTwo(n));

        n = 2147483647;
        assertFalse(pow.isPowerOfTwo(n));
    }

}