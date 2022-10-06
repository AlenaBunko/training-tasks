package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NimGameTest {

    NimGame nimGame = new NimGame();

    @Test
    void testDifferentCountOfStones() {
        assertTrue(nimGame.canWinNim(1));
        assertTrue(nimGame.canWinNim(3));
        assertFalse(nimGame.canWinNim(4));
        assertTrue(nimGame.canWinNim(42));
        assertTrue(nimGame.canWinNim(10235));
        assertTrue(nimGame.canWinNim(202303));
        assertFalse(nimGame.canWinNim(124));
        assertFalse(nimGame.canWinNim(202000));
    }

}