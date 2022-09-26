package com.github.alenabunko.leetcode.string;

/**
 * Задача Длина последнего слова
 * <a href="https://leetcode.com/problems/length-of-last-word/">...</a>
 * Для заданной строки s, состоящей из слов и пробелов, вернуть длину последнего слова в строке.
 * Ограничения:
 * 1 <= s.length <= 10^4
 * строка s состоит только из английских букв и пробелов ' '.
 * в s будет хотя бы одно слово.
 */
public class LengthOfLastWord {

    /**
     * Метод возвращает длину последнего слова, исключая пробелы
     *
     * @param s строка
     * @return длину последнего слова в строке
     */
    public int lengthOfLastWord(String s) {
        String[] result = s.trim().split(" ");
        return result[result.length - 1].length();
    }
}
