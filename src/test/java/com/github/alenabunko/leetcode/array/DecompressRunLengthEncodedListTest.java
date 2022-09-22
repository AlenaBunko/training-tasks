package com.github.alenabunko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecompressRunLengthEncodedListTest {

    DecompressRunLengthEncodedList encodedList = new DecompressRunLengthEncodedList();

    @Test
    void testDifferentValues() {
        assertArrayEquals(new int[]{2, 4, 4, 4}, encodedList.decompressRLElist(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{1, 3, 3}, encodedList.decompressRLElist(new int[]{1, 1, 2, 3}));
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, encodedList.decompressRLElist(new int[]{5, 1}));
        assertArrayEquals(new int[]{11, 17, 17, 42, 42, 42}, encodedList.decompressRLElist(new int[]{1, 11, 2, 17, 3, 42}));
    }

}