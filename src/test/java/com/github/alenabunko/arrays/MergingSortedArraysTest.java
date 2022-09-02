package com.github.alenabunko.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergingSortedArraysTest {

    @Test
    void testDifferentLength() {
        assertArrayEquals(new int[]{1, 1, 2, 4, 4, 6, 7}, MergingSortedArrays.mergeArr(new int[]{1, 4}, new int[]{1, 2, 4, 6, 7}));
    }

    @Test
    void testArrayEmpty() {
        assertArrayEquals(new int[]{3, 4}, MergingSortedArrays.mergeArr(new int[]{}, new int[]{3, 4}));
    }

    @Test
    void testSameLength() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, MergingSortedArrays.mergeArr(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    void testSameValues() {
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, MergingSortedArrays.mergeArr(new int[]{1, 1, 1}, new int[]{1, 1}));
    }
}
