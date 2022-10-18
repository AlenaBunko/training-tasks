package com.github.alenabunko.leetcode.string;

/**
 * Задача Обратная строка
 * <a href="https://leetcode.com/problems/reverse-string/description/">...</a>
 * Напишите функцию, которая переворачивает строку. Входная строка задается как массив символов s.
 * Вы должны сделать это, изменив входной массив на месте с дополнительной памятью O (1).
 * Ограничения:
 * 1 <= s.length <= 10^5
 * s[i] — печатный символ ascii.
 */
public class ReverseString {

    /**
     * Метод переворачивает входной массива char
     *
     * @param s входной массив
     */
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }
}
