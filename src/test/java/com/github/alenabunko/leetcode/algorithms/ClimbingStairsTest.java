package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    void testDifferentCombinationOfElements() {
        assertEquals(1, climbingStairs.climbStairs(1));
        assertEquals(8, climbingStairs.climbStairs(5));
        assertEquals(21, climbingStairs.climbStairs(7));
        assertEquals(317811, climbingStairs.climbStairs(27));
        assertEquals(1836311903, climbingStairs.climbStairs(45));
    }
}