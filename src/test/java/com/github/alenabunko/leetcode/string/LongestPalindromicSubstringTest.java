package com.github.alenabunko.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    void differentVariouOfStrings() {
        assertEquals("d", longestPalindromicSubstring.longestPalindrome("d"));
        assertEquals("ww", longestPalindromicSubstring.longestPalindrome("kwws"));
        assertEquals("nnn", longestPalindromicSubstring.longestPalindrome("kwwsmtronnnp"));
        assertEquals("swows", longestPalindromicSubstring.longestPalindrome("kwaswowswras"));
        assertEquals("porop", longestPalindromicSubstring.longestPalindrome("dnpopanoporopm"));
        assertEquals("poroporop", longestPalindromicSubstring.longestPalindrome("dnporoporopm"));
        assertEquals("454454", longestPalindromicSubstring.longestPalindrome("34544548"));
        assertEquals("p1o2r2o1p", longestPalindromicSubstring.longestPalindrome("mp1o2r2o1ponapopnd"));
    }

}