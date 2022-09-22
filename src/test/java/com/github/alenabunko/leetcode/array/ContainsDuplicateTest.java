package com.github.alenabunko.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    void testDifferentCombinationOfElements(){
        int[] nums = new int[]{1,2,3,1};
        assertTrue(containsDuplicate.containsDuplicate(nums));

        int[] nums1 = new int[]{1,2,3,4};
        assertFalse(containsDuplicate.containsDuplicate(nums1));

        int[] nums2 = new int[]{2};
        assertFalse(containsDuplicate.containsDuplicate(nums2));

        int[] nums3 = new int[]{1,1,1,3,3,4,3,2,4,2};
        assertTrue(containsDuplicate.containsDuplicate(nums3));

        int[] nums4 = new int[]{-100,1,-100,3,-3,4,3,2,4,2};
        assertTrue(containsDuplicate.containsDuplicate(nums4));
    }

}