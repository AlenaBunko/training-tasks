package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UglyNumberTest {

    UglyNumber uglyNumber = new UglyNumber();

    @Test
    void testDifferentValuesOfNumber() {
        assertTrue(uglyNumber.isUgly(1));
        assertTrue(uglyNumber.isUgly(8));
        assertTrue(uglyNumber.isUgly(512));
        assertFalse(uglyNumber.isUgly(-125336));
        assertFalse(uglyNumber.isUgly(14));
        assertFalse(uglyNumber.isUgly(10025005));
    }

}