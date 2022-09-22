package com.github.alenabunko.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Задача Римские цифры
 * <a href="https://leetcode.com/problems/roman-to-integer/">...</a>
 * Римские цифры представлены семью различными символами: I, V, X, L, C, D и M.
 * Нужно преобразовать римскую цифру в число
 */
public class RomanToInteger {

    /**
     * Метод преобразовывает римские цифры в число
     * @param s римские цифры
     * @return число
     */
    public int romanToInt(String s) {

        List<Integer> result = new ArrayList<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> result.add(1);
                case 'V' -> result.add(5);
                case 'X' -> result.add(10);
                case 'L' -> result.add(50);
                case 'C' -> result.add(100);
                case 'D' -> result.add(500);
                case 'M' -> result.add(1000);
            }
        }

        int number = result.get(0);

        for (int j = 1; j < result.size(); j++) {
            if (result.get(j) < result.get(j - 1)){
                number -= result.get(j);
            }else {
                number += result.get(j);
            }
        }
        return number;
    }
}
