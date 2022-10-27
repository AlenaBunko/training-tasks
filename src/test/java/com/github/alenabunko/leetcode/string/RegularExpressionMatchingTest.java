package com.github.alenabunko.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    RegularExpressionMatching regEx = new RegularExpressionMatching();

    @Test
    void testDifferentValuesStringAndPattern() {
        assertTrue(regEx.isMatch("aa", "a*"));
        assertTrue(regEx.isMatch("ab", ".*"));
        assertTrue(regEx.isMatch("aaaaaaaaaaa", "a*"));
        assertTrue(regEx.isMatch("abbbbbbbbbbbbbb", ".*"));
        assertTrue(regEx.isMatch("bbbbbbbbbba", ".*"));
        assertFalse(regEx.isMatch("aa", "a"));
        assertFalse(regEx.isMatch("aabbbbbbbaaaaaa", "a."));
    }
}