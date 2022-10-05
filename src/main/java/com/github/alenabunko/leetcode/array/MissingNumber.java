package com.github.alenabunko.leetcode.array;

import java.util.Arrays;

/**
 * Задача Отсутствующее число
 * <a href="https://leetcode.com/problems/missing-number/description/">...</a>
 * Учитывая массив nums, содержащий n различных чисел в диапазоне [0, n], вернуть единственное число в диапазоне, отсутствующее в массиве.
 * Ограничения:
 * n == nums.length
 * 1 <= n <= 10^4
 * 0 <= nums[i] <= n
 * Все числа в массиве уникальные
 */
public class MissingNumber {

    /**
     * Метод возвращает элемент, отсутствующий в массиве
     *
     * @param nums исходный массив
     * @return элемент, отсутствубщий в массиве
     */
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
