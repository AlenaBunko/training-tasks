package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateIITest {

    ContainsDuplicateII duplicate = new ContainsDuplicateII();

    @Test
    void testDifferentCombinationOfElements() {
        int[] array1 = new int[]{1, 2, 3, 1};
        int k = 3;
        assertTrue(duplicate.containsNearbyDuplicate(array1, k));

        int[] array2 = new int[]{1, 0, 1, 1};
        int n = 1;
        assertTrue(duplicate.containsNearbyDuplicate(array2, n));

        int[] array3 = new int[]{1, 2, 3, 1, 2, 3};
        int m = 2;
        assertFalse(duplicate.containsNearbyDuplicate(array3, m));

        int[] array4 = new int[]{1};
        int v = 1;
        assertFalse(duplicate.containsNearbyDuplicate(array4, v));
    }
}