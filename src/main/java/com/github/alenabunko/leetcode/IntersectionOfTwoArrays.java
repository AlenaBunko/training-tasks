package com.github.alenabunko.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        HashMap<Integer, Integer> hashMapNums1 = new HashMap<>();
        HashMap<Integer, Integer> hashMapNums2 = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        fillInTheHashMap(nums1, hashMapNums1);
        fillInTheHashMap(nums2, hashMapNums2);

        for (Map.Entry<Integer, Integer> entries1 : hashMapNums1.entrySet()) {
            Integer keyHashMap1 = entries1.getKey();

            for (Map.Entry<Integer, Integer> entries2 : hashMapNums2.entrySet()) {
                Integer keyHashMap2 = entries2.getKey();

                if (keyHashMap1.equals(keyHashMap2)) {
                    int valueForList = entries1.getValue() < entries2.getValue() ? entries1.getValue() : entries2.getValue();

                    for (int n = 0; n < valueForList; n++) {
                        list.add(keyHashMap1);
                    }
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    static void fillInTheHashMap(int[] nums, HashMap<Integer, Integer> hashMapNums) {

        for (int k : nums) {
            int count = 0;
            for (int i : nums) {
                if (k == i) {
                    count++;
                }
            }
            hashMapNums.put(k, count);
        }
    }
}
