package com.github.alenabunko.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {

    WordPattern wordPattern = new WordPattern();

    @Test
    void testDifferentValuesPatternsAndStrings() {
        String pattern = "abba";
        String s = "dog kat kat dog";
        assertTrue(wordPattern.wordPattern(pattern, s));

        pattern = "abba";
        s = "dog kat kat fish";
        assertFalse(wordPattern.wordPattern(pattern, s));

        pattern = "abba";
        s = "dog dog dog dog";
        assertFalse(wordPattern.wordPattern(pattern, s));

        pattern = "aaa";
        s = "aaa aaa aaa aaa";
        assertFalse(wordPattern.wordPattern(pattern, s));

        pattern = "aaa";
        s = "java java java";
        assertTrue(wordPattern.wordPattern(pattern, s));
    }
}