package com.github.alenabunko.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void testDifferentCombinationOfElements() {
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("c", longestCommonPrefix.longestCommonPrefix(new String[]{"cir", "car"}));
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"", "car"}));
    }

}