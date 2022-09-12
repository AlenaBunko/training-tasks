package com.github.alenabunko.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    BestTimeToBuyAndSellStock bestTime = new BestTimeToBuyAndSellStock();

    @Test
    void testDifferentCombinationOfElements() {
        assertEquals(7, bestTime.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(4, bestTime.maxProfit(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, bestTime.maxProfit(new int[]{7, 6, 4, 3, 1}));
        assertEquals(0, bestTime.maxProfit(new int[]{7}));
    }

}