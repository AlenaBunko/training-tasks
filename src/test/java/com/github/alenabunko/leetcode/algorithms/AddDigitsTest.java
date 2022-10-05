package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDigitsTest {
    AddDigits add = new AddDigits();

    @Test
    void testDifferentNumbers() {

        int num = 0;
        assertEquals(0, add.addDigits(num));

        num = 38;
        assertEquals(2, add.addDigits(num));

        num = 999;
        assertEquals(9, add.addDigits(num));

        num = 998;
        assertEquals(8, add.addDigits(num));

        num = 100101;
        assertEquals(3, add.addDigits(num));

        num = 2147483641;
        assertEquals(4, add.addDigits(num));
    }
}