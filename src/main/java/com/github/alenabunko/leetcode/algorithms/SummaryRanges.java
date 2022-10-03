package com.github.alenabunko.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Задача Суммарные диапазоны
 * <a href="https://leetcode.com/problems/summary-ranges/description/">...</a>
 * Дан отсортированный массив nums с уникальными элементами.
 * Диапазон [a,b] — это набор всех целых чисел от a до b (включительно).
 * Возвращает наименьший отсортированный список диапазонов, точно покрывающий все числа в массиве. То есть каждый элемент
 * nums покрывается ровно одним из диапазонов, и не существует целого числа x, такого что x находится в одном из диапазонов,но не в nums.
 * Каждый диапазон [a, b] в списке должен выводиться как:
 * "а->b", если а != b
 * "а", если а == b
 * Ограничения:
 * 0 <= nums.length <= 20
 * -2^31 <= nums[i] <= 2^31 - 1
 * Все значения nums уникальны.
 * Числа сортируются в порядке возрастания.
 */
public class SummaryRanges {

    /**
     * Метод возвращает список диапазонов, в зависимости от последовательного расположения элементов массива, из которого берутся данные
     *
     * @param nums исходный массив
     * @return список диапазонов, выраженный "a -> b", если разница между последовательными элементами в массиве равна 1, где
     * a - первый элемент диапазона и b - последний элемент диапазона, либо только "a", где а - элемент массива, разница которого
     * с предыдущим/следующим элементами больше 1
     */
    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();
        int startIndex = 0;

        if (nums.length == 0) {
            return result;
        }

        while (startIndex < nums.length) {
            String start = String.valueOf(nums[startIndex]);
            String end = "";

            while (startIndex + 1 < nums.length && nums[startIndex + 1] - nums[startIndex] == 1) {
                end = String.valueOf(nums[++startIndex]);
            }

            if (end.length() > 0) {
                start = start + "->" + end;
            }

            result.add(start);
            startIndex++;
        }

        return result;
    }
}
