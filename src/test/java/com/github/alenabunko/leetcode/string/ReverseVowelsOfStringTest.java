package com.github.alenabunko.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsOfStringTest {

    ReverseVowelsOfString vowels = new ReverseVowelsOfString();

    @Test
    void testDifferentStrings() {
        assertEquals("holle", vowels.reverseVowels("hello"));
        assertEquals("leotcede", vowels.reverseVowels("leetcode"));
        assertEquals("h", vowels.reverseVowels("h"));
        assertEquals("devoleper", vowels.reverseVowels("developer"));
        assertEquals("comminacituon", vowels.reverseVowels("communication"));
    }

}