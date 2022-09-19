package com.github.alenabunko.leetcode;

/**
 * Задача Сумма двух элементов
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/">...</a>
 * Дан массив чисел nums и число target. Необходимо найти два элемента массива, сумма которых будет равна target и вернуть
 * новый массив, содержащий индексы данных элементов
 * Ограничения:
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 * Только один правильный ответ
 */
public class TwoSum {

    /**
     * Метод возвращает массив двух индексов элементов исходного массива, сумма которых будет равна числу target
     *
     * @param nums   исходный массив
     * @param target число
     * @return новый массив, состоящий из индексов элементов исходного массива
     */
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        int index = 0;

        while (index < nums.length) {

            for (int i = index + 1; i < nums.length; i++) {
                if (nums[index] + nums[i] == target && index != i) {
                    result[0] = index;
                    result[1] = i;
                    return result;
                }
            }

            index++;
        }

        return result;
    }
}