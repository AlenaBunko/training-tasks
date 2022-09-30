package com.github.alenabunko.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Задача Содержание дубликатов
 * <a href="https://leetcode.com/problems/contains-duplicate-ii/description/">...</a>
 * Для массива целых чисел nums и целого числа k вернуть true, если в массиве есть два различных индекса i и j,
 * таких что nums[i] == nums[j] и abs(i - j) <= k.
 * Ограничения:
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * 0 <= k <= 10^5
 */
public class ContainsDuplicateII {

    /**
     * Метод возвращает true, если в массиве есть дубликаты, а разность индексов повторяющихся элементов меньше либо равно числу k
     *
     * @param nums исходный массив
     * @param k    число
     * @return true, если разность индексов повторяющихся элементов в массиве меньше либо равно заданному числу k, в противном случае false
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (result.containsKey(nums[i]) && i - result.get(nums[i]) <= k) {
                return true;
            } else {
                result.put(nums[i], i);
            }
        }
        return false;
    }
}
