package com.github.alenabunko.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Задача Составить самый длинный палиндром
 * <a href="https://leetcode.com/problems/longest-palindrome/description/?envType=study-plan&id=level-1">...</a>
 * Для заданной строки s, состоящей из строчных или прописных букв, вернуть длину самого длинного палиндрома,
 * который можно построить из этих букв.
 * Буквы чувствительны к регистру, например, «Аа» здесь не считается палиндромом.
 * Ограничения:
 * 1 <= s.length <= 2000
 * s состоит только из строчных и/или прописных английских букв.
 */
public class LongestPalindrom {

    /**
     * Метод возвращает длину самого длинного палиндрома, который можно составить из букв входной строки
     *
     * @param s входная строка
     * @return длину самого длинного палиндрома, который можно составить из букв входной строки
     */
    public int longestPalindrome(String s) {

        if (s.length() <= 1) {
            return s.length();
        }

        HashMap<Character, Integer> countLiterals = new HashMap<>();
        int result = s.length();

        for (Character c : s.toCharArray()) {
            countLiterals.put(c, 1 + countLiterals.getOrDefault(c, 0));
        }

        ArrayList<Integer> listValues = countLiterals.entrySet()
            .parallelStream()
            .collect(ArrayList::new,
                (list, element) -> list.add(element.getValue()),
                ArrayList::addAll);

        for (Integer value : listValues) {
            if (value % 2 == 1) {
                result -= 1;
            }
        }
        return result < s.length() ? result + 1 : result;
    }

}
