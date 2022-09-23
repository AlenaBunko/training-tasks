package com.github.alenabunko.leetcode.string;

/**
 * Задача Самый длинный общий префикс
 * <a href="https://leetcode.com/problems/longest-common-prefix/">...</a>
 * Напишите функцию, которая находит самую длинную строку общего префикса среди массива строк.
 * Если общего префикса нет, вернуть пустую строку "".
 * Ограничения:
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] состоит только из строчных латинских букв.
 */
public class LongestCommonPrefix {

    /**
     * Метод возвращает самую длинную строку общего префикса среди массива строк
     *
     * @param strs исходный массив
     * @return самую длинную строку общего префикса среди массива строк
     */
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
