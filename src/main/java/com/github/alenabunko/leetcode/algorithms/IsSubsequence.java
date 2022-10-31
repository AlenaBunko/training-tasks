package com.github.alenabunko.leetcode.algorithms;

/**
 * Задача Подпоследовательность строки
 * <a href="https://leetcode.com/problems/is-subsequence/description/">...</a>
 * Имея две строки s и t, вернуть true, если s является подпоследовательностью t, или false в противном случае.
 * Подпоследовательность строки — это новая строка, образованная из исходной строки путем удаления некоторых (может быть ни одного)
 * символов без нарушения взаимного расположения оставшихся символов. (т. е. «ace» является подпоследовательностью «abcde»,
 * а «aec» — нет).
 * Ограничения:
 * 0 <= s.length <= 100
 * 0 <= t.length <= 10^4
 * s и t состоят только из строчных английских букв.
 */
public class IsSubsequence {

    /**
     * Метод возвращает true, если s является подпоследовательностью t, или false в противном случае.
     *
     * @param s строка
     * @param t строка
     * @return true, если s является подпоследовательностью t, или false в противном случае.
     */
    public boolean isSubsequence(String s, String t) {

        StringBuilder sbdr = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                sbdr.append(t.charAt(j));
                i++;
            }
            if (sbdr.length() == s.length()) {
                return true;
            }
            j++;
        }

        return s.equals(sbdr.toString());
    }
}
