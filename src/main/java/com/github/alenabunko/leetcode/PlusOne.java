package com.github.alenabunko.leetcode;

import static java.lang.System.arraycopy;

/**
 * Задача Плюс Один
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/">...</a>
 * Вам дано большое целое число, представленное в виде целочисленного массива цифр, где каждая цифра[i] — это i-я цифра целого числа.
 * Цифры упорядочены от наиболее значащего к наименее значащему в порядке слева направо. Большое целое число не содержит ведущих нулей.
 * Увеличьте большое целое число на единицу и верните результирующий массив цифр.
 * Ограничения:
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 */
public class PlusOne {

    /**
     * Метод увеличивает на единицу целое число, представленное в виде массива, каждая цифра данного числа расположена в отдельной ячейке массива
     *
     * @param digits целое число, представленное в виде массива
     * @return результирующий массив, содержащий целое число, увеличенное на единицу, каждая цифра которого расположена в отдельной ячейке
     */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                break;
            }
        }
        if (digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            arraycopy(digits, 0, result, 1, digits.length - 1);
            return result;
        }
        return digits;
    }
}
