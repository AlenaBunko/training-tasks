package com.github.alenabunko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationTest {

    @Test
    void testDifferentElements() {
        Permutation permutation = new Permutation();
        assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3}, permutation.buildArray(new int[]{0, 2, 1, 5, 3, 4}));
        assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3}, permutation.buildArray(new int[]{5, 0, 1, 2, 3, 4}));
        assertArrayEquals(new int[]{1, 2, 0}, permutation.buildArray(new int[]{2, 0, 1}));
    }
}