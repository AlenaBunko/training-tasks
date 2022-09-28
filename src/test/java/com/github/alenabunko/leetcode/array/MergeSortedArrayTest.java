package com.github.alenabunko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    MergeSortedArray merge = new MergeSortedArray();

    @Test
    void testDifferentCombinationOfData() {
        int[] arr1 = new int[]{1};
        int[] arr2 = new int[]{};
        merge.merge(arr1, 1, arr2, 0);
        assertArrayEquals(new int[]{1}, arr1);

        int[] arr3 = new int[]{1, 2, 3, 0, 0, 0};
        int[] arr4 = new int[]{2, 5, 6};
        merge.merge(arr3, 3, arr4, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, arr3);

        int[] arr5 = new int[]{-1, 0, 0, 3, 3, 3, 0, 0, 0};
        int[] arr6 = new int[]{1, 2, 2};
        merge.merge(arr5, 6, arr6, 3);
        assertArrayEquals(new int[]{-1, 0, 0, 1, 2, 2, 3, 3, 3}, arr5);
    }
}