package com.github.alenabunko.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void testDifferentStrings() {
        String firstString = "A man, a plan, a canal: Panama";
        assertTrue(validPalindrome.isPalindrome(firstString));

        String secondString = "race a car";
        assertFalse(validPalindrome.isPalindrome(secondString));

        String emptyString = " ";
        assertTrue(validPalindrome.isPalindrome(emptyString));
    }

}