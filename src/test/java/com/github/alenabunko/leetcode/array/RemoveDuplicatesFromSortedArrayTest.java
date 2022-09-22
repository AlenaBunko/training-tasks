package com.github.alenabunko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    RemoveDuplicatesFromSortedArray removeDuplicates = new RemoveDuplicatesFromSortedArray();

    @Test
    void testWithReteatingElements() {
        assertEquals(2, removeDuplicates.decompressRLElist(new int[]{1, 1, 2}));
        assertEquals(5, removeDuplicates.decompressRLElist(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        assertEquals(1, removeDuplicates.decompressRLElist(new int[]{1, 1, 1}));
        assertEquals(6, removeDuplicates.decompressRLElist(new int[]{-97, -42, -42, -23, 0, 0, 0, 17, 36, 36, 36}));
    }

}