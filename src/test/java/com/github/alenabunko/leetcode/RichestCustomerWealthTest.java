package com.github.alenabunko.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RichestCustomerWealthTest {

    RichestCustomerWealth rcw = new RichestCustomerWealth();

    @Test
    void testEqualNumberOfAccount() {
        assertEquals(10, rcw.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
        assertEquals(8, rcw.maximumWealth(new int[][]{{1, 5}, {7, 1}, {1, 5}}));
        assertEquals(14, rcw.maximumWealth(new int[][]{{5, 5}, {7, 7}, {9, 5}}));
    }

    @Test
    void testDifferentNumberOfAccount() {
        assertEquals(18, rcw.maximumWealth(new int[][]{{1, 5}, {7, 3, 8}, {3, 5}}));
        assertEquals(43, rcw.maximumWealth(new int[][]{{1, 5, 2}, {7, 1}, {1, 5, 15, 22}}));
        assertEquals(38, rcw.maximumWealth(new int[][]{{5, 5, 1}, {7, 7, 10, 12, 2}, {9, 5}}));
    }

    @Test
    void testEqualAmountOfMoney() {
        assertEquals(6, rcw.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
        assertEquals(10, rcw.maximumWealth(new int[][]{{5, 5}, {5, 5}, {5, 5}}));
        assertEquals(15, rcw.maximumWealth(new int[][]{{7, 7, 1}, {7, 5, 3}, {6, 6, 3}}));
    }
}