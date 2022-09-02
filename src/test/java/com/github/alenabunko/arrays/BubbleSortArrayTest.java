package com.github.alenabunko.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortArrayTest {

    @Test
    void testEmptyArray() {
        assertArrayEquals(new int[]{}, BubbleSortArray.bubbleSort(new int[]{}));
    }

    @Test
    void testUnsortedArray() {
        assertArrayEquals(new int[]{3, 8, 11, 42, 77, 101, 158}, BubbleSortArray.bubbleSort(new int[]{42, 11, 77, 3, 8, 158, 101}));
    }

    @Test
    void testRepeatingElements() {
        assertArrayEquals(new int[]{1, 3, 3, 5, 17, 36, 36, 58, 89}, BubbleSortArray.bubbleSort(new int[]{58, 36, 17, 36, 3, 5, 89, 1, 3}));
    }
}