package com.github.alenabunko.leetcode;

import java.util.*;

/**
 * Задача Пересечение двух массивов II
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/">...</a>
 * Даны два массива. Нужно найти все элементы, которые повторяются в обоих массивах, результат можно вернуть в любом порядке
 * Ограничения:
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 */
public class IntersectionOfTwoArrays {

    /**
     * Метод возвращает массив пересечений элементов двух исходных массивов
     *
     * @param nums1 первый массив
     * @param nums2 второй массив
     * @return массив элементов, которые встречаются в обоих массивах
     */
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> valueFromNum1ToCount = countsByValue(nums1);
        Map<Integer, Integer> valueFromNum2ToCount = countsByValue(nums2);

        Set<Integer> nums = new HashSet<>();
        nums.addAll(valueFromNum1ToCount.keySet());
        nums.addAll(valueFromNum2ToCount.keySet());

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            int countInNums1 = valueFromNum1ToCount.getOrDefault(num, 0);
            int countInNums2 = valueFromNum2ToCount.getOrDefault(num, 0);
            int minValue = Math.min(countInNums1, countInNums2);
            for (int i = 0; i < minValue; i++) {
                list.add(num);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    static Map<Integer, Integer> countsByValue(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int k : nums) {
            result.put(k, 1 + result.getOrDefault(k, 0));
        }

        return result;
    }
}
