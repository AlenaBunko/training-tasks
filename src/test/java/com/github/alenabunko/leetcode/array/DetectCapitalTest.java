package com.github.alenabunko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectCapitalTest {

    DetectCapital detectCapital = new DetectCapital();

    @Test
    void testDifferentStrings() {
        assertTrue(detectCapital.detectCapitalUse("USA"));
        assertTrue(detectCapital.detectCapitalUse("leetcode"));
        assertTrue(detectCapital.detectCapitalUse("Google"));
        assertTrue(detectCapital.detectCapitalUse("U"));
        assertTrue(detectCapital.detectCapitalUse("a"));

        assertFalse(detectCapital.detectCapitalUse("FlaG"));
        assertFalse(detectCapital.detectCapitalUse("aPP"));
        assertFalse(detectCapital.detectCapitalUse("WordWiThCapital"));
    }

}