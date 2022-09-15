package com.github.alenabunko.leetcode;

import java.util.Arrays;

/**
 * Дан целочисленный массив nums, вернуть true, если какое-либо значение встречается в массиве не менее двух раз,
 * и вернуть false, если каждый элемент уникален.
 * Ограничения:
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 */
public class ContainsDuplicate {

    /**
     * Метод вычисляет наличие дубликатов в исходном массиве
     *
     * @param nums исходный массив
     * @return true, если дубликаты есть, в противном случае - false
     */
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
}
