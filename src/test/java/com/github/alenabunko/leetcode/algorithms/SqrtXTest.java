package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtXTest {

    SqrtX root = new SqrtX();

    @Test
    void testDifferentCombinationOfElements() {
        assertEquals(0, root.mySqrt(0));
        assertEquals(8, root.mySqrt(66));
        assertEquals(1, root.mySqrt(3));
        assertEquals(77, root.mySqrt(6052));
        assertEquals(46340, root.mySqrt(2147395600));
    }

}