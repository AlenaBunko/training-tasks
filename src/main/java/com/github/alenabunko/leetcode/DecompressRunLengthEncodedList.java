package com.github.alenabunko.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Задача 1313 Распаковать закодированный список длин серий
 * Нам дан список nums целых чисел, представляющий список, сжатый с кодированием длин серий.
 * Рассмотрим каждую соседнюю пару элементов [freq, val] = [nums[2*i], nums[2*i+1]] (где i >= 0). Для каждой такой пары
 * есть элементы freq со значением val, объединенные в подсписок. Объедините все подсписки слева направо, чтобы создать распакованный список.
 * Вернуть распакованный список.
 * Ограничения:
 * 2 <= nums.length <= 100
 * nums.length % 2 == 0
 * 1 <= nums[i] <= 100
 */
public class DecompressRunLengthEncodedList {

    /**
     * Метод определяет новый массив, состоящий из элементов, равных значениям исходного массива, расположенных в нечетных позициях,
     * которые повторяются подряд в новом массиве в количестве, равном значению, расположенному в исходном массиве в четных позициях,
     * предшествующих нечетным, начиная с нуля включительно
     *
     * @param nums список, сжатый с кодированием длин серий
     * @return распакованный список
     */
    public int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < nums[i]; j++) {
                    result.add(nums[i + 1]);
                }
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
