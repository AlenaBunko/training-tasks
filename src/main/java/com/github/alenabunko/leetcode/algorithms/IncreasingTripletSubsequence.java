package com.github.alenabunko.leetcode.algorithms;

/**
 * Задача Увеличение подпоследовательности триплетов
 * <a href="https://leetcode.com/problems/increasing-triplet-subsequence/description/">...</a>
 * Для массива целых чисел nums вернуть true, если существует тройка индексов (i, j, k), такая что i < j < k
 * и nums[i] < nums[j] < nums[k]. Если таких индексов не существует, вернуть false.
 * Ограничения:
 * 1 <= nums.length <= 5 * 10^5
 * -2^31 <= nums[i] <= 2^31 - 1
 */
public class IncreasingTripletSubsequence {

    /**
     * Метод возвращает true, если  существует тройка индексов (i, j, k), такая что i < j < k и nums[i] < nums[j] < nums[k],
     * в противном случае false
     *
     * @param nums исходный массив
     * @return true, если  существует тройка индексов (i, j, k), такая что i < j < k и nums[i] < nums[j] < nums[k],
     * в противном случае false
     */
    public boolean increasingTriplet(int[] nums) {
        int min = nums[0];
        int temp = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {

            if (min >= nums[i]) {
                min = nums[i];
            } else if (nums[i] <= temp) {
                temp = nums[i];
            } else {
                return true;
            }
        }

        return false;
    }
}
