package com.github.alenabunko.leetcode;

import java.util.stream.IntStream;

/**
 * Задача 1929 Объединение массивов
 * Учитывая целочисленный массив nums длины n, нужно создать массив ans длины 2n,
 * где ans[i] == nums[i] и ans[i + n] == nums[i] для 0 <= i < n (0-индексированный).
 */

public class ConcatenationOfArrays {

    /**
     * Метод создает массив, который равен двойному размеру исходного массива и состоит из продублированного исходного массива
     * без сортировки
     *
     * @param nums исходный массив
     * @return новый массив, включающий продублированный неотсортированный исходный массив
     */
    public int[] getConcatenation(int[] nums) {
        IntStream concat = IntStream.concat(IntStream.of(nums), IntStream.of(nums));
        return concat.toArray();
    }
}
