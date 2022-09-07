package com.github.alenabunko.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayReverseTest {

    @Test
    void testArrayWithLengthMoreThenZero() {
        int[] a = new int[]{29, 8, 2022};
        ArrayReverse.flip(a);
        assertArrayEquals(new int[]{2022, 8, 29}, a);

        int[] b = new int[]{11, 24, 33, 33, 42, 57, 69};
        ArrayReverse.flip(b);
        assertArrayEquals(new int[]{69, 57, 42, 33, 33, 24, 11}, b);

        int[] c = new int[]{22, 42};
        ArrayReverse.flip(c);
        assertArrayEquals(new int[]{42, 22}, c);
    }

    @Test
    void testEmptyArray() {
        int[] a = new int[]{};
        ArrayReverse.flip(a);
        assertArrayEquals(new int[]{}, a);
    }

    @Test
    void testNegativeValues() {
        int[] a = new int[]{-205, -42, -33, -51};
        ArrayReverse.flip(a);
        assertArrayEquals(new int[]{-51, -33, -42, -205}, a);
    }

}
