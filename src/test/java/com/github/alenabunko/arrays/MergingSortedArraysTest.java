package com.github.alenabunko.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergingSortedArraysTest {

    @Test
    void testDifferentLength() {
        assertArrayEquals(new int[]{1, 1, 2, 4, 4, 6, 7}, MergingSortedArrays.mergeArr(new int[]{1, 4}, new int[]{1, 2, 4, 6, 7}));
        assertArrayEquals(new int[]{1, 1, 2, 4, 4, 6, 7}, MergingSortedArrays.mergeArr(new int[]{1, 2, 4, 6}, new int[]{1, 4, 7}));
        assertArrayEquals(new int[]{1, 4, 4, 7, 7, 8, 11, 11}, MergingSortedArrays.mergeArr(new int[]{1, 4, 7, 8, 11}, new int[]{4, 7, 11}));
        assertArrayEquals(new int[]{41, 77, 77, 88, 88}, MergingSortedArrays.mergeArr(new int[]{77, 88}, new int[]{41, 77, 88}));
    }

    @Test
    void testArrayEmpty() {
        assertArrayEquals(new int[]{}, MergingSortedArrays.mergeArr(new int[]{}, new int[]{}));
    }

    @Test
    void testSameLength() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, MergingSortedArrays.mergeArr(new int[]{1, 2}, new int[]{3, 4}));
        assertArrayEquals(new int[]{1, 2, 3, 4}, MergingSortedArrays.mergeArr(new int[]{2, 4}, new int[]{1, 3}));
    }

    @Test
    void testSameValues() {
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, MergingSortedArrays.mergeArr(new int[]{1, 1, 1}, new int[]{1, 1}));
    }
}
