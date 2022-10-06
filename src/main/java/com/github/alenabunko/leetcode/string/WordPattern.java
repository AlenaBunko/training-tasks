package com.github.alenabunko.leetcode.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Задача Шаблон слова
 * <a href="https://leetcode.com/problems/word-pattern/description/">...</a>
 * Учитывая шаблон pattern и строку s, найти, следует ли s тому же шаблону.
 * Ограничения:
 * 1 <= pattern.length <= 300
 * pattern содержит только строчные английские буквы.
 * 1 <= s.length <= 3000
 * s содержит только строчные английские буквы и пробелы ' '.
 * s не содержит начальных или конечных пробелов.
 * Все слова в s разделены одним пробелом.
 */
public class WordPattern {

    /**
     * Метод возвращает true, если символ шаблона pattern соответствует слову в строке s, соблюдая последовательность, в противном
     * случае false. Если размер шаблона не равен размеру строки s без пробелов, метод вернет false
     *
     * @param pattern шаблон
     * @param s       строка, состоящая из нескольких слов
     * @return true, если символ шаблона pattern соответствует слову в строке s, соблюдая последовательность, в противном
     * случае false
     */
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        Map<Character, String> result = new HashMap<>();

        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            if (result.containsKey(pattern.charAt(i))) {
                if (!Objects.equals(result.get(pattern.charAt(i)), words[i])) {
                    return false;
                }
            } else if (result.containsValue(words[i])) {
                String value = words[i];
                Character key = getKey(result, value);
                if (!key.equals(pattern.charAt(i))) {
                    return false;
                }
            }
            result.put(pattern.charAt(i), words[i]);
        }
        return true;
    }

    char getKey(Map<Character, String> map, String value) {
        char key = 0;
        for (Map.Entry<Character, String> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                key = entry.getKey();
            }
        }
        return key;
    }
}
