package com.github.alenabunko.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortArrayTest {

    @Test
    void testEmptyArray() {
        int[] a = new int[]{};
        BubbleSortArray.sort(a);
        assertArrayEquals(new int[]{}, a);
    }

    @Test
    void testUnsortedArray() {
        int[] a = new int[]{42, 11, 77, 3, 8, 158, 101};
        BubbleSortArray.sort(a);
        assertArrayEquals(new int[]{3, 8, 11, 42, 77, 101, 158}, a);

        int[] c = new int[]{3, -3};
        BubbleSortArray.sort(c);
        assertArrayEquals(new int[]{-3, 3}, c);
    }

    @Test
    void testRepeatingElements() {
        int[] a = new int[]{58, 36, 17, 36, 3, 5, 89, 1, 3};
        BubbleSortArray.sort(a);
        assertArrayEquals(new int[]{1, 3, 3, 5, 17, 36, 36, 58, 89}, a);

        int[] b = new int[]{1, 0, 1, 0};
        BubbleSortArray.sort(b);
        assertArrayEquals(new int[]{0, 0, 1, 1}, b);

    }
}