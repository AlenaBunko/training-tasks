package com.github.alenabunko.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    void testDifferentCombinationOfElements() {
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{11, 15}, 26));
        assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 2}, twoSum.twoSum(new int[]{3, 2, 3}, 6));
        assertArrayEquals(new int[]{0, 2}, twoSum.twoSum(new int[]{2, 5, -5, 11}, -3));
        assertArrayEquals(new int[]{3, 10}, twoSum.twoSum(new int[]{0, 5, 5, 2, 11, 42, 13, 30, 4, 15, 10}, 12));
    }

}