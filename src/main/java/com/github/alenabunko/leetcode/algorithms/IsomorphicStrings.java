package com.github.alenabunko.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Задача Изоморфные строки
 * <a href="https://leetcode.com/problems/isomorphic-strings/">...</a>
 * Имея две строки s и t, определите, изоморфны ли они.
 * Две строки s и t изоморфны, если символы в s можно заменить, чтобы получить t.
 * Все вхождения символа должны быть заменены другим символом с сохранением порядка символов. Никакие два символа не могут
 * отображаться на один и тот же символ, но символ может отображаться на самого себя.
 * Ограничения:
 * 1 <= s.length <= 5 * 10^4
 * t.length == s.length
 * s и t состоят из любого допустимого символа ascii
 */
public class IsomorphicStrings {

    /**
     * Метод возвращает true, если строки изоморфны, т.е символ одной строки может быть заменен только символом другой строки,
     * сохраняя порядок. Два символа одной строки не могут отображаться, как один символ второй строки и наоборот
     *
     * @param s первая строка
     * @param t вторая строка
     * @return true, если строки изоморфны, в противном случае false
     */
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> res = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (res.containsKey(s.charAt(i))) {
                if (res.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            if (res.containsValue(t.charAt(i))) {
                char value = t.charAt(i);
                Character key = getKeyByValue(res, value);
                if (!key.equals(s.charAt(i))) {
                    return false;
                }
            }
            res.putIfAbsent(s.charAt(i), t.charAt(i));
        }
        return true;
    }

    static char getKeyByValue(Map<Character, Character> map, char value) {
        char key = 0;
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            if (value == (entry.getValue())) {
                key = entry.getKey();
            }
        }
        return key;
    }
}
