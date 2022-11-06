package com.github.alenabunko.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayCakeCandlesTest {

    @Test
    void testDifferentValuesOfLists() {
        assertEquals(1, BirthdayCakeCandles.birthdayCakeCandles(List.of(4)));
        assertEquals(2, BirthdayCakeCandles.birthdayCakeCandles(List.of(4, 2, 1, 4)));
        assertEquals(26, BirthdayCakeCandles.birthdayCakeCandles(List.of(9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999)));
        assertEquals(56, BirthdayCakeCandles.birthdayCakeCandles(List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)));
    }

}