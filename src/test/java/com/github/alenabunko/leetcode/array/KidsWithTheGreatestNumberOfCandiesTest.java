package com.github.alenabunko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KidsWithTheGreatestNumberOfCandiesTest {

    KidsWithTheGreatestNumberOfCandies kidsCandies = new KidsWithTheGreatestNumberOfCandies();

    @Test
    void testDifferentCountOfElements() {
        assertArrayEquals(new Object[]{true, true, true, false, true}, (kidsCandies.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3)).toArray());
        assertArrayEquals(new Object[]{true, false, false, false, false}, (kidsCandies.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1)).toArray());
        assertArrayEquals(new Object[]{true, false, true, false, true}, (kidsCandies.kidsWithCandies(new int[]{4, 3, 8, 2, 5}, 4)).toArray());
        assertArrayEquals(new Object[]{true, false, true}, (kidsCandies.kidsWithCandies(new int[]{12, 1, 12}, 10)).toArray());
        assertArrayEquals(new Object[]{true, true}, (kidsCandies.kidsWithCandies(new int[]{12, 42}, 33)).toArray());
    }
}