package com.github.alenabunko.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void testDifferentCombinationOfElements() {
        assertTrue(palindromeNumber.isPalindrome(121));
        assertTrue(palindromeNumber.isPalindrome(0));
        assertFalse(palindromeNumber.isPalindrome(-121121));
        assertFalse(palindromeNumber.isPalindrome(10));
        assertFalse(palindromeNumber.isPalindrome(123351));
    }
}