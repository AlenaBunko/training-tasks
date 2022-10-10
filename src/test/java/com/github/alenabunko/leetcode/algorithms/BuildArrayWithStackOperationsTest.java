package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayWithStackOperationsTest {

    BuildArrayWithStackOperations buildArray = new BuildArrayWithStackOperations();

    @Test
    void testAbsentElement() {
        List<String> resultList = Arrays.asList("Push", "Push", "Pop", "Push");
        assertEquals(resultList, buildArray.buildArray(new int[]{1, 3}, 3));
    }

    @Test
    void testSortedElements() {
        List<String> resultList = Arrays.asList("Push", "Push", "Push");
        assertEquals(resultList, buildArray.buildArray(new int[]{1, 2, 3}, 3));
    }

    @Test
    void testNumberGreaterThanArrayLength() {
        List<String> resultList = Arrays.asList("Push", "Push");
        assertEquals(resultList, buildArray.buildArray(new int[]{1, 2}, 4));
    }

    @Test
    void testNumberLessThanArrayLength() {
        List<String> resultList = Arrays.asList("Push", "Push", "Push", "Pop");
        assertEquals(resultList, buildArray.buildArray(new int[]{1, 2, 4, 5, 7}, 3));
    }
}