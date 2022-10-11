package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingTripletSubsequenceTest {

    IncreasingTripletSubsequence triplet = new IncreasingTripletSubsequence();

    @Test
    void testDifferentValuesOfElements() {
        assertTrue(triplet.increasingTriplet(new int[]{1, 2, 3, 4}));
        assertTrue(triplet.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
        assertTrue(triplet.increasingTriplet(new int[]{20, 100, 10, 12, 5, 13}));
        assertTrue(triplet.increasingTriplet(new int[]{5, 4, 6, 5, 7}));
        assertTrue(triplet.increasingTriplet(new int[]{5, 4, 6, 5, 3, 2, 7, 8, 10}));
        assertTrue(triplet.increasingTriplet(new int[]{1, 2, 1, 3}));
        assertTrue(triplet.increasingTriplet(new int[]{4, 3, 6, 2, 3, 4}));
        assertTrue(triplet.increasingTriplet(new int[]{1, 2, Integer.MAX_VALUE}));

        assertFalse(triplet.increasingTriplet(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertFalse(triplet.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        assertFalse(triplet.increasingTriplet(new int[]{5, 4, 6, 5, 3}));
        assertFalse(triplet.increasingTriplet(new int[]{6, 7, 1, 2}));
    }

}