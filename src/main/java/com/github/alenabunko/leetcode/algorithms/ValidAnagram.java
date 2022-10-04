package com.github.alenabunko.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Задача Действительная анаграмма
 * <a href="https://leetcode.com/problems/valid-anagram/description/">...</a>
 * Имея две строки s и t, вернуть true, если t является анаграммой s, и false в противном случае.
 * Анаграмма — это слово или фраза, образованная путем перестановки букв другого слова или фразы, обычно с использованием
 * всех исходных букв ровно один раз.
 * Ограничения:
 * 1 <= s.length, t.length <= 5 * 10^4
 * s и t состоят из строчных английских букв.
 */
public class ValidAnagram {

    /**
     * Метод возвращает true, если строка s является анаграммой строки t, в противном случае false
     *
     * @param s первая строка
     * @param t вторая строка
     * @return rue, если строка s является анаграммой строки t, в противном случае false
     */
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> wordS = new HashMap<>();
        Map<Character, Integer> wordT = new HashMap<>();

        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                wordS.put(s.charAt(i), wordS.getOrDefault(s.charAt(i), 0) + 1);
                wordT.put(t.charAt(i), wordT.getOrDefault(t.charAt(i), 0) + 1);
            }
            return wordS.equals(wordT);
        }

        return false;
    }
}
