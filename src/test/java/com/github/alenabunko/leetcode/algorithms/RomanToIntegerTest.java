package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    RomanToInteger romanToInteger = new RomanToInteger();
    @Test
    void testDifferentCombinationOfElements() {

        assertEquals(3, romanToInteger.romanToInt("III"));
        assertEquals(9, romanToInteger.romanToInt("IX"));
        assertEquals(4, romanToInteger.romanToInt("IV"));
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
        assertEquals(99, romanToInteger.romanToInt("XCIX"));
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}