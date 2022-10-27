package com.github.alenabunko.leetcode.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задача Сопоставление с регулярным выражением
 * <a href="https://leetcode.com/problems/regular-expression-matching/description/">...</a>
 * Имея входную строку s и шаблон p, реализуйте сопоставление регулярных выражений с поддержкой '.' и где:
 * '.' Соответствует любому одиночному символу.
 * '*' Соответствует нулю или более предшествующих элементов.
 * Сопоставление должно охватывать всю входную строку (не частичную).
 * Ограничения:
 * 1 <= s.length <= 20
 * 1 <= p.length <= 30
 * s содержит только строчные латинские буквы.
 * p содержит только строчные латинские буквы, '.' и '*'.
 * Гарантируется, что для каждого появления символа '*' будет соответствовать предыдущий допустимый символ.
 */
public class RegularExpressionMatching {

    /**
     * Метод возвращает true, когда имеет место полное совпадение входной строки с шаблоном
     *
     * @param s входная строка
     * @param p шаблон
     * @return true, когда имеет место полное совпадение входной строки с шаблоном, в противном случае false
     */
    public boolean isMatch(String s, String p) {

        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);

        return matcher.matches();
    }
}
