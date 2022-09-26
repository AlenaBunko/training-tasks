package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    SearchInsertPosition search = new SearchInsertPosition();

    @Test
    void testDifferentCombinationOfElements() {
        assertEquals(7, search.searchInsert(new int[]{0, 2, 5, 8, 11, 14, 19, 24, 28}, 21));
        assertEquals(2, search.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(4, search.searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(1, search.searchInsert(new int[]{1}, 7));
        assertEquals(4, search.searchInsert(new int[]{-8750, -6211, -2033, -999, -3, 0, 158, 201, 399, 1820, 4117, 9999}, -706));
        assertEquals(3, search.searchInsert(new int[]{-8750, -6211, -2033, -999, -3, 0, 158, 201, 399, 1820, 4117, 9999}, -999));
    }

}