package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    ValidAnagram validAnagram = new ValidAnagram();

    @Test
    void testDifferentStrings() {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(validAnagram.isAnagram(s, t));

        s = "car";
        t = "tar";
        assertFalse(validAnagram.isAnagram(s, t));

        s = "a";
        t = "ab";
        assertFalse(validAnagram.isAnagram(s, t));
    }
}