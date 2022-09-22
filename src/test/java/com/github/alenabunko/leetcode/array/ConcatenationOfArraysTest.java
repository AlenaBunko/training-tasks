package com.github.alenabunko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationOfArraysTest {
    ConcatenationOfArrays concatenation = new ConcatenationOfArrays();

    @Test
    void testDifferentElements() {
        assertArrayEquals(new int[]{1, 2, 1, 1, 2, 1}, concatenation.getConcatenation(new int[]{1, 2, 1}));
        assertArrayEquals(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 1}, concatenation.getConcatenation(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{0, 0, 1, 1, 0, 0, 1, 1}, concatenation.getConcatenation(new int[]{0, 0, 1, 1}));
    }

    @Test
    void testEmptyArray() {
        assertArrayEquals(new int[]{}, concatenation.getConcatenation(new int[]{}));
    }

    @Test
    void testOnlyOneElement() {
        assertArrayEquals(new int[]{42, 42}, concatenation.getConcatenation(new int[]{42}));
    }
}