package com.github.alenabunko.leetcode.array;


/**
 * Задача 1920 Построить массив из перестановки
 * Учитывая отсчитываемую от нуля перестановку nums (0-индексированную), создайте массив ans той же длины, где
 * ans[i] = nums[nums[i]] для каждого 0 <= i < nums.length, и верните его.
 * Перестановка nums с отсчетом от нуля представляет собой массив различных целых чисел от 0 до nums.length - 1 (включительно).
 * Ограничения:
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] < nums.length
 * Элементы в nums различны.
 */
public class Permutation {

    /**
     * Метод возвращает новый массив, состоящий из элементов исходного массива в порядке, определенном перестановкой элементов
     * исходного массива
     *
     * @param nums исходный массив
     * @return новый массив, созданный путем перестановки элементов
     */
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
