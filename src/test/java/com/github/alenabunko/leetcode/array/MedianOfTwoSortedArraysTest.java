package com.github.alenabunko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    MedianOfTwoSortedArrays median = new MedianOfTwoSortedArrays();

    @Test
    void testDifferentValuesOfElements() {
        assertEquals(2.0, median.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        assertEquals(2.5, median.findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4}));
        assertEquals(2.5, median.findMedianSortedArrays(new int[]{1}, new int[]{4}));
        assertEquals(8.0, median.findMedianSortedArrays(new int[]{1, 3, 5, 17}, new int[]{2, 8, 10, 11, 15}));
    }
}