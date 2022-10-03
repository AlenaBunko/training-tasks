package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {

    SummaryRanges ranges = new SummaryRanges();

    @Test
    void testDifferentCombinationOfElements() {
        List<String> testList = new ArrayList<>();
        assertEquals(testList, ranges.summaryRanges(new int[]{}));

        testList = new ArrayList<>(List.of("0->2", "4->5", "7"));
        assertEquals(testList, ranges.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));

        testList = new ArrayList<>(List.of("0", "2->4", "6", "8->9"));
        assertEquals(testList, ranges.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));

        testList = new ArrayList<>(List.of("0", "2->4", "6", "8->9", "11", "15", "21"));
        assertEquals(testList, ranges.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9, 11, 15, 21}));
    }
}