package com.github.alenabunko.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayClassificationTest {

    @Test
    void testUnsortedArray() {
        assertEquals("other", ArrayClassification.classification(new int[]{12, 0, 45, 101, 7, 11}));
    }

    @Test
    void testIncreasingArray() {
        assertEquals("increasing", ArrayClassification.classification(new int[]{11, 12, 13}));
    }

    @Test
    void testEmptyArray() {
        assertEquals("empty", ArrayClassification.classification(new int[]{}));
    }

    @Test
    void testDecreasingArray() {
        assertEquals("decreasing", ArrayClassification.classification(new int[]{21, 18, 17, 10, 4}));
    }

    @Test
    void testConstantElement() {
        assertEquals("constant", ArrayClassification.classification(new int[]{1, 1, 1, 1, 1, 1, 1}));
    }

    @Test
    void testIncreasingArrayWithRepeatingElements() {
        assertEquals("increasing", ArrayClassification.classification(new int[]{1, 1, 20, 300}));
    }

    @Test
    void testFirstAndLastElementsAreTheSame(){
        assertEquals("other", ArrayClassification.classification(new int[]{0, 1, 1, 0}));
    }
}