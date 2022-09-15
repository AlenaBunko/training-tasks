package com.github.alenabunko.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysTest {

    IntersectionOfTwoArrays intersection = new IntersectionOfTwoArrays();

@Test
    void testDifferentCountOfElements() {
    assertArrayEquals(new int[]{2, 2}, intersection.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    assertArrayEquals(new int[]{4, 9}, intersection.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
    assertArrayEquals(new int[]{2}, intersection.intersect(new int[]{1, 2, 2, 1}, new int[]{2}));
    assertArrayEquals(new int[]{1, 2}, intersection.intersect(new int[]{1, 2, 2, 1}, new int[]{1, 2}));
    assertArrayEquals(new int[]{1, 1, 2}, intersection.intersect(new int[]{2, 2, 2, 1, 1}, new int[]{1, 2, 1}));
    assertArrayEquals(new int[]{1}, intersection.intersect(new int[]{1, 2}, new int[]{1, 1}));
    assertArrayEquals(new int[]{1}, intersection.intersect(new int[]{3, 1, 2}, new int[]{1, 1}));
    assertArrayEquals(new int[]{0, 0, 7, 42}, intersection.intersect(new int[]{0, 7, 11, 9, 7, 0, 0, 42}, new int[]{42, 0, 7, 23, 0}));
    }
}