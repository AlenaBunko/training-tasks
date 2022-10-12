package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerAtoiTest {

    StringToIntegerAtoi atoi = new StringToIntegerAtoi();

    @Test
    void testDifferentStrings() {
        assertEquals(4193, atoi.myAtoi("4193 with words"));
        assertEquals(-42, atoi.myAtoi("   -42"));
        assertEquals(0, atoi.myAtoi("              "));
        assertEquals(0, atoi.myAtoi("words and 978"));
        assertEquals(42, atoi.myAtoi("42  58  pop 99"));
        assertEquals(-2147483648, atoi.myAtoi("-91283472332"));
        assertEquals(2147483647, atoi.myAtoi("2147486648"));
    }

}