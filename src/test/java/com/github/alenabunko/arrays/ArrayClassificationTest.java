package com.github.alenabunko.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayClassificationTest {

    @Test
    void testUnsortedArray() {
        assertEquals("other", ArrayClassification.classify(new int[]{12, 0, 45, 101, 7, 11}));
        assertEquals("other", ArrayClassification.classify(new int[]{97, 77, 57, 63, 62, 61}));
        assertEquals("other", ArrayClassification.classify(new int[]{16, 21, 25, 29, 39, 34}));
    }

    @Test
    void testIncreasingArray() {
        assertEquals("increasing", ArrayClassification.classify(new int[]{11, 12, 13}));
        assertEquals("increasing", ArrayClassification.classify(new int[]{42, 43}));
        assertEquals("increasing", ArrayClassification.classify(new int[]{45, 47, 99}));
    }

    @Test
    void testEmptyArray() {
        assertEquals("empty", ArrayClassification.classify(new int[]{}));
    }

    @Test
    void testDecreasingArray() {
        assertEquals("decreasing", ArrayClassification.classify(new int[]{21, 18, 17, 10, 4}));
        assertEquals("decreasing", ArrayClassification.classify(new int[]{97, 83, 61, 25, 11, -1, -9}));
        assertEquals("decreasing", ArrayClassification.classify(new int[]{8, 7}));
    }

    @Test
    void testConstantElement() {
        assertEquals("constant", ArrayClassification.classify(new int[]{1, 1, 1, 1, 1, 1, 1}));
    }

    @Test
    void testIncreasingArrayWithRepeatingElements() {
        assertEquals("increasing", ArrayClassification.classify(new int[]{1, 1, 20, 300}));
        assertEquals("increasing", ArrayClassification.classify(new int[]{17, 25, 25, 25, 25}));
        assertEquals("increasing", ArrayClassification.classify(new int[]{5, 16, 41, 41, 41, 84, 84}));
    }

    @Test
    void testFirstAndLastElementsAreTheSame() {
        assertEquals("other", ArrayClassification.classify(new int[]{0, 1, 1, 0}));
        assertEquals("other", ArrayClassification.classify(new int[]{14, 14, 14, 13, 13, 13, 14, 14}));
        assertEquals("other", ArrayClassification.classify(new int[]{5, 4, 3, 2, -5, 5}));
    }

    @Test
    void testOnlyTwoElements() {
        assertEquals("increasing", ArrayClassification.classify(new int[]{0, 1}));
        assertEquals("increasing", ArrayClassification.classify(new int[]{10, 19}));
        assertEquals("increasing", ArrayClassification.classify(new int[]{-28, -1}));
    }

    @Test
    void testOneElementInArray() {
        assertEquals("constant", ArrayClassification.classify(new int[]{1}));
    }
}