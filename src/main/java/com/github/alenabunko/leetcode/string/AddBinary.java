package com.github.alenabunko.leetcode.string;

/**
 * Задача Сумма двоичной строки
 * <a href="https://leetcode.com/problems/add-binary/">...</a>
 * Имея две двоичные строки a и b, верните их сумму в виде двоичной строки.
 * Ограничения:
 * 1 <= a.length, b.length <= 10^4
 * a и b состоят только из символов «0» или «1».
 * Каждая строка не содержит ведущих нулей, кроме самого нуля.
 */
public class AddBinary {

    /**
     * Метод возвращает сумму двоичных строк
     *
     * @param a первая двоичная строка
     * @param b вторая двоичная строка
     * @return сумма a и b в виде двоичной строки
     */
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }
}
