package com.github.alenabunko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    RemoveElement removeElement = new RemoveElement();

    @Test
    void testDifferentCombinationOfElements() {
        assertEquals(2, removeElement.removeElement(new int[]{3, 2, 2, 3}, 3));
        assertEquals(0, removeElement.removeElement(new int[]{}, 0));
        assertEquals(0, removeElement.removeElement(new int[]{2, 2, 2, 2}, 2));
        assertEquals(5, removeElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        assertEquals(8, removeElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 22));
    }

}