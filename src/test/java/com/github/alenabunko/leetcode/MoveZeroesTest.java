package com.github.alenabunko.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    void testDifferentCombinationOfElements() {

        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);

        int[] nums1 = new int[]{0};
        moveZeroes.moveZeroes(nums1);
        assertArrayEquals(new int[]{0}, nums1);

        int[] nums2 = new int[]{0, 12, 0, 1, 3, 0, 0};
        moveZeroes.moveZeroes(nums2);
        assertArrayEquals(new int[]{12, 1, 3, 0, 0, 0, 0}, nums2);

        int[] nums3 = new int[]{2, 1};
        moveZeroes.moveZeroes(nums3);
        assertArrayEquals(new int[]{2, 1}, nums3);

        int[] nums4 = new int[]{4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        moveZeroes.moveZeroes(nums4);
        assertArrayEquals(new int[]{4, 2, 4, 3, 5, 1, 0, 0, 0, 0}, nums4);

        int[] nums5 = new int[]{-4, 2, -34, 0, 0, 31, 0, -5, 1, 0};
        moveZeroes.moveZeroes(nums5);
        assertArrayEquals(new int[]{-4, 2, -34, 31, -5, 1, 0, 0, 0, 0}, nums5);
    }
}