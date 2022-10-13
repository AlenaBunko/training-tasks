package com.github.alenabunko.leetcode.algorithms;

/**
 * Задача Деление двух чисел
 * <a href="https://leetcode.com/problems/divide-two-integers/description/">...</a>
 * Даны делимое и делитель двух целых чисел, разделить два целых числа без использования операций умножения, деления и модуля.
 * Целочисленное деление должно усекаться до нуля, что означает потерю дробной части. Например, 8,345 будет усечено до 8,
 * а -2,7335 будет усечено до -2.
 * Верните частное после деления делимого на делитель.
 * Примечание. Предположим, что мы имеем дело со средой, которая может хранить целые числа только в диапазоне 32-битных целых чисел
 * со знаком: [−2^31, 2^31 − 1]. Для этой задачи, если частное строго больше 2^31 - 1, вернуть 2^31 - 1, а если частное строго
 * меньше -2^31, вернуть -2^31.
 * Ограничения:
 * -2^31 <= dividend, divisor <= 2^31 - 1
 * divisor != 0
 */
public class DivideTwoIntegers {

    /**
     * Метод возвращает частное после деления делимого на делитель
     *
     * @param dividend делимое
     * @param divisor  делитель
     * @return частное после деления делимого на делитель
     */
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int firstDigit = Math.abs(dividend);
        int secondDigit = Math.abs(divisor);
        int result = 0;

        while (firstDigit - secondDigit >= 0) {
            int temp = 0;
            while (firstDigit - (secondDigit << 1 << temp) > 0) {
                temp++;
            }
            result += 1 << temp;
            firstDigit -= secondDigit << temp;
        }
        return (dividend >= 0 && divisor > 0 || dividend < 0 && divisor < 0) ? result : -1 * result;
    }
}
