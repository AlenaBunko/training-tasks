package com.github.alenabunko.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayReverseTest {

    @Test
    void testArrayWithLengthMoreThenZero() {
        assertArrayEquals(new int[]{2022, 8, 29}, ArrayReverse.reverse(new int[]{29, 8, 2022}));
    }

    @Test
    void testEmptyArray() {
        assertArrayEquals(new int[]{}, ArrayReverse.reverse(new int[]{}));
    }

    @Test
    void testNegativeValues() {
        assertArrayEquals(new int[]{-51, -33, -42, -205}, ArrayReverse.reverse(new int[]{-205, -42, -33, -51}));
    }

}
