package com.github.alenabunko.leetcode;

import java.util.Arrays;

/**
 * Учитывая целочисленный массив nums, вернуть true, если какое-либо значение встречается в массиве не менее двух раз,
 * и вернуть false, если каждый элемент различен.
 * Ограничения:
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */
public class ContainsDuplicate {

    /**
     * Метод вычисляет наличие дубликатов в исходном массиве
     *
     * @param nums исходный массив
     * @return true, если дубликаты есть, в противном случае - false
     */
    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;
    }
}
