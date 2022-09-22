package com.github.alenabunko.leetcode.array;

import static java.lang.System.arraycopy;

/**
 * Дан массив, поверните массив вправо на k шагов, где k неотрицательно.
 * Ограничения:
 * 1 <= nums.length <= 10^5
 * -2^31 <= nums[i] <= 2^31 - 1
 * 0 <= k <= 10^5
 */
public class RotateArray {

    /**
     * Метод переносит последние k элементов исходного массива в начало не меняя порядка следования, при этом сдвигая оставшуюся
     * часть массива, начиная с нулевого элемента, но уже с позиции k в исходном массиве
     *
     * @param nums исходный массив
     * @param k количество элементов в конце массива, которые должны быть перенесены в начало, сохраняя последовательность
     */
    public void rotate(int[] nums, int k) {

        k %= nums.length;

        int[] buffer = new int[k];

        arraycopy(nums, nums.length - k, buffer, 0, k);

        arraycopy(nums, 0, nums, k, nums.length - k);

        arraycopy(buffer, 0, nums, 0, k);
    }
}
