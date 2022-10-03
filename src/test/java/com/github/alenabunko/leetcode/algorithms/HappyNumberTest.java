package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    HappyNumber happyNumber = new HappyNumber();

    @Test
    void testDifferentCombinationOfElements() {
        int n = 1;
        assertTrue(happyNumber.isHappy(n));

        n = 2;
        assertFalse(happyNumber.isHappy(n));

        n = 4;
        assertFalse(happyNumber.isHappy(n));

        n = 19;
        assertTrue(happyNumber.isHappy(n));

        n = 22;
        assertFalse(happyNumber.isHappy(n));

        n = 125101;
        assertTrue(happyNumber.isHappy(n));

        n = 2111121;
        assertTrue(happyNumber.isHappy(n));
    }

}