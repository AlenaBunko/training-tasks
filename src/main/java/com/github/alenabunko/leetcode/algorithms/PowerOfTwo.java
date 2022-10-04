package com.github.alenabunko.leetcode.algorithms;

/**
 * Задача Квадрат двойки
 * <a href="https://leetcode.com/problems/power-of-two/description/">...</a>
 * Учитывая число n, вернуть true, если оно является степенью двойки. В противном случае вернуть false.
 * Ограничения:
 * -2^31 <= n <= 2^31 - 1
 */
public class PowerOfTwo {

    /**
     * Метод возвращает true, если число n является степенью двойки, в противном случае false
     *
     * @param n число
     * @return true, если число n является степенью двойки, в противном случае false
     */
    public boolean isPowerOfTwo(int n) {
        int i = 0;

        while (i < 31) {
            if ((int) Math.pow(2, i) == n) {
                return true;
            }
            i++;
        }
        return false;
    }
}
