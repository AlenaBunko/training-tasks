package com.github.alenabunko.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    SingleNumber singleNumber = new SingleNumber();

    @Test
    void testDifferentCombinationOfElements() {
        assertEquals(4, singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
        assertEquals(1, singleNumber.singleNumber(new int[]{2, 2, 1}));
        assertEquals(2, singleNumber.singleNumber(new int[]{-42, 1, -42, 1, 2}));
        assertEquals(1, singleNumber.singleNumber(new int[]{1}));
    }
}