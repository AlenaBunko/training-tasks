package com.github.alenabunko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    MissingNumber missingNumber = new MissingNumber();

    @Test
    void testDifferentCombinationOfElements() {
        assertEquals(1, missingNumber.missingNumber(new int[]{0}));
        assertEquals(0, missingNumber.missingNumber(new int[]{1}));
        assertEquals(2, missingNumber.missingNumber(new int[]{0, 1}));
        assertEquals(0, missingNumber.missingNumber(new int[]{1, 2}));
        assertEquals(2, missingNumber.missingNumber(new int[]{0, 3, 1}));
        assertEquals(1, missingNumber.missingNumber(new int[]{0, 2, 3}));
        assertEquals(8, missingNumber.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}