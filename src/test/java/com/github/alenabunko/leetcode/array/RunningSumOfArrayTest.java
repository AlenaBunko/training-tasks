package com.github.alenabunko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumOfArrayTest {

    RunningSumOfArray runningSumOfArray = new RunningSumOfArray();

    @Test
    void testDifferentElementOfArray() {
        assertArrayEquals(new int[]{1, 3, 6, 10}, runningSumOfArray.runningSum(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{1}, runningSumOfArray.runningSum(new int[]{1}));
        assertArrayEquals(new int[]{1, 2, 3, 4}, runningSumOfArray.runningSum(new int[]{1, 1, 1, 1}));
        assertArrayEquals(new int[]{1, 202, 3203, 43204}, runningSumOfArray.runningSum(new int[]{1, 201, 3001, 40001}));
        assertArrayEquals(new int[]{10, 120, 1230, 12340}, runningSumOfArray.runningSum(new int[]{10, 110, 1110, 11110}));
    }

}