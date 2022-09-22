package com.github.alenabunko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {
    PlusOne plusOne = new PlusOne();

    @Test
    void testDifferentCombinationOfElements() {

        assertArrayEquals(new int[]{2}, plusOne.plusOne(new int[]{1}));
        assertArrayEquals(new int[]{1, 0}, plusOne.plusOne(new int[]{9}));
        assertArrayEquals(new int[]{1, 0, 0}, plusOne.plusOne(new int[]{9, 9}));
        assertArrayEquals(new int[]{1, 9, 0}, plusOne.plusOne(new int[]{1, 8, 9}));
        assertArrayEquals(new int[]{9, 0, 0}, plusOne.plusOne(new int[]{8, 9, 9}));
        assertArrayEquals(new int[]{1, 0, 9, 0}, plusOne.plusOne(new int[]{1, 0, 8, 9}));
        assertArrayEquals(new int[]{1, 3, 0, 2}, plusOne.plusOne(new int[]{1, 3, 0, 1}));
        assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 1}, plusOne.plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
    }
}