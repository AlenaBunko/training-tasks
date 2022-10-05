package com.github.alenabunko.leetcode.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Задача Уродливое число
 * <a href="https://leetcode.com/problems/ugly-number/description/">...</a>
 * Уродливое число — это положительное целое число, простые множители которого ограничены 2, 3 и 5.
 * Ограничения:
 * -2^31 <= n <= 2^31 - 1
 */
public class UglyNumber {

    /**
     * Метод возвращает true, если n — уродливое число, т.е. простые множители которого ограничены 2, 3, 5, в противном случае false
     *
     * @param n число
     * @return true, если n — уродливое число, в противном случае false
     */
    public boolean isUgly(int n) {
        Set<Integer> set = new HashSet<>();

        while (n >= 1) {
            if (n == 1) {
                return true;
            }
            if (n % 5 == 0) {
                n /= 5;
            }
            if (n % 3 == 0) {
                n /= 3;
            }
            if (n % 2 == 0) {
                n /= 2;
            }
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
        return false;
    }
}
