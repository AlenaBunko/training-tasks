package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    void testDifferentValueOfInteger() {
        assertEquals(0, reverseInteger.reverse(Integer.MAX_VALUE));
        assertEquals(0, reverseInteger.reverse(Integer.MIN_VALUE));
        assertEquals(0, reverseInteger.reverse(1534236469));
        assertEquals(-2, reverseInteger.reverse(-2));
        assertEquals(-132, reverseInteger.reverse(-231));
        assertEquals(231, reverseInteger.reverse(132));
        assertEquals(-2143847412, reverseInteger.reverse(-2147483412));
        assertEquals(2147483641, reverseInteger.reverse(1463847412));
    }
}