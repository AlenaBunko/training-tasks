package com.github.alenabunko.leetcode.array;

/**
 * Задача Текущая сумма массива
 * <a href="https://leetcode.com/problems/running-sum-of-1d-array/description/?envType=study-plan&id=level-1">...</a>
 * Дан массив nums. Мы определяем текущую сумму массива как runningSum[i] = sum(nums[0]…nums[i]).
 * Возвращает текущую сумму чисел.
 * Ограничения:
 * 1 <= nums.length <= 1000
 * -10^6 <= nums[i] <= 10^6
 */
public class RunningSumOfArray {

    /**
     * Метод возвращает массив, значение элементов которого равно сумме предыдущих элементов с текущим
     *
     * @param nums исходный массив
     * @return массив, значение элементов которого равно сумме предыдущих элементов с текущим
     */
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
