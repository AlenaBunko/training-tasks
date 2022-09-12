package com.github.alenabunko.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.System.arraycopy;

/**
 * Дан массив, поверните массив вправо на k шагов, где k неотрицательно.
 * Ограничения:
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 105
 */
public class RotateArray {

    /**
     * Метод переносит последние k элементов исходного массива в начало не меняя порядка следования, при этом сдвигая оставшуюся
     * часть массива, начиная с нулевого элемента, но уже с позиции k в исходном массиве
     *
     * @param nums исходный массив
     * @param k    исходный массив с учетом перестановки элементов
     */
    public void rotate(int[] nums, int k) {

        if (nums.length >= k) {
            join(nums, k);
        } else {
            k %= nums.length;
            join(nums, k);
        }
    }

    static void join(int[] nums, int k) {
        int[] intOne = Arrays.stream(nums)
                .skip(nums.length - k)
                .limit(k)
                .toArray();

        int[] intTwo = Arrays.stream(nums)
                .skip(0)
                .limit(nums.length - k)
                .toArray();

        int[] expectedNums = IntStream.concat(IntStream.of(intOne), IntStream.of(intTwo)).toArray();

        arraycopy(expectedNums, 0, nums, 0, nums.length);
    }
}
