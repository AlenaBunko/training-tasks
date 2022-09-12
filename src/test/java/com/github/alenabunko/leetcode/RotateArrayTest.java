package com.github.alenabunko.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    RotateArray rotateArray = new RotateArray();

    @Test
    void testDifferentCombinationOfElements() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray.rotate(nums, k);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);

        int[] nums1 = new int[]{-1, -100, 3, 99};
        k = 2;
        rotateArray.rotate(nums1, k);
        assertArrayEquals(new int[]{3, 99, -1, -100}, nums1);

        int[] nums2 = new int[]{2};
        k = 1;
        rotateArray.rotate(nums2, k);
        assertArrayEquals(new int[]{2}, nums2);

        int[] nums3 = new int[]{-23, -11, -5, 2, 16, 44, 42};
        k = 0;
        rotateArray.rotate(nums3, k);
        assertArrayEquals(new int[]{-23, -11, -5, 2, 16, 44, 42}, nums3);

        int[] nums4 = new int[]{1, 2};
        k = 3;
        rotateArray.rotate(nums4, k);
        assertArrayEquals(new int[]{2, 1}, nums4);
    }
}
