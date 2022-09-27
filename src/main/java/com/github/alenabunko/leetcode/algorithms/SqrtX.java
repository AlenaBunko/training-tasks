package com.github.alenabunko.leetcode.algorithms;

/**
 * Задача Квадратный корень
 * <a href="https://leetcode.com/problems/sqrtx/">...</a>
 * Дано число х, вычислить и вернуть квадратный корень числа х
 * Поскольку тип возвращаемого значения — целое число, десятичные цифры усекаются, и возвращается только целая часть результата.
 * Примечание. Не разрешено использовать какие-либо встроенные функции экспоненты или операторы, такие как pow(x, 0.5) или x ** 0.5.
 * Ограничения:
 * 0 <= x <= 2^31 - 1
 */
public class SqrtX {

    /**
     * Метод возвращает квадратный корень числа х
     *
     * @param x число
     * @return квадратный корень числа х
     */
    public int mySqrt(int x) {
        int digit = 1;
        int start = 1;
        int end = x;

        if (x == 0) {
            return 0;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid <= (x / mid)) {
                start = mid + 1;
                digit = mid;
            } else {
                end = mid - 1;
            }
        }
        return digit;
    }
}
