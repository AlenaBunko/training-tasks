package com.github.alenabunko.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void testUnsortedArray() {
        int[] a = new int[]{59, 99, -42, 15, 24, 256, 78};
        QuickSort.sort(a);
        assertArrayEquals(new int[]{-42, 15, 24, 59, 78, 99, 256}, a);

        int[] b = new int[]{-10, 97, 42};
        QuickSort.sort(b);
        assertArrayEquals(new int[]{-10, 42, 97}, b);

        int[] c = new int[]{57, 22};
        QuickSort.sort(c);
        assertArrayEquals(new int[]{22, 57}, c);
    }

    @Test
    void testEmptyArray() {
        int[] a = new int[]{};
        QuickSort.sort(a);
        assertArrayEquals(new int[]{}, a);
    }

    @Test
    void testSingleElement() {
        int[] a = new int[]{11};
        QuickSort.sort(a);
        assertArrayEquals(new int[]{11}, a);
    }

}