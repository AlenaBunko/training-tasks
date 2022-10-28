package com.github.alenabunko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPivotIndexTest {

    FindPivotIndex pivotIndex = new FindPivotIndex();

    @Test
    void testDifferentValuesOfElementsArray() {
        assertEquals(0, pivotIndex.pivotIndex(new int[]{-1}));
        assertEquals(-1, pivotIndex.pivotIndex(new int[]{1, 2, 3}));
        assertEquals(0, pivotIndex.pivotIndex(new int[]{2, 1, -1}));
        assertEquals(2, pivotIndex.pivotIndex(new int[]{1, -1, 8}));
        assertEquals(-1, pivotIndex.pivotIndex(new int[]{8, 1, 1, 1}));
        assertEquals(1, pivotIndex.pivotIndex(new int[]{7, 2, 2, 5}));
        assertEquals(3, pivotIndex.pivotIndex(new int[]{0, 4, 7, 5, 5, 6}));
        assertEquals(2, pivotIndex.pivotIndex(new int[]{-1, -1, -1, -1, -1, 0}));
        assertEquals(-1, pivotIndex.pivotIndex(new int[]{-1, -1, -1, -1, -1, -1}));
        assertEquals(5, pivotIndex.pivotIndex(new int[]{-1, -1, 0, 1, 1, 0}));
    }
}