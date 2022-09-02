package com.github.alenabunko.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void testUnsortedArray() {
        int[] a = new int[]{59, 99, -42, 15, 24, 256, 78};
        assertArrayEquals(new int[]{-42, 15, 24, 59, 78, 99, 256}, QuickSort.quick(a, 0, a.length - 1));
    }

    @Test
    void testEmptyArray() {
        int[] a = new int[]{};
        assertArrayEquals(new int[]{}, QuickSort.quick(a, 0, a.length - 1));
    }


    @Test
    void testSingleElement() {
        int[] a = new int[]{11};
        assertArrayEquals(new int[]{11}, QuickSort.quick(a, 0, 0));
    }

}