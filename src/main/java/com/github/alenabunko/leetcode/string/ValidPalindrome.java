package com.github.alenabunko.leetcode.string;

/**
 * Задача Допустимый палиндром
 * <a href="https://leetcode.com/problems/valid-palindrome/">...</a>
 * Фраза является палиндромом, если после преобразования всех прописных букв в строчные и удаления всех не буквенно-цифровых
 * символов она читается одинаково вперед и назад. Буквенно-цифровые символы включают буквы и цифры.
 * Учитывая строку s, вернуть true, если это палиндром, или false в противном случае.
 * Ограничения:
 * 1 <= s.length <= 2 * 10^5
 * s состоит только из печатных символов ASCII.
 */
public class ValidPalindrome {

    /**
     * Метод возвращает true, если строка s является палиндромом
     *
     * @param s строка
     * @return true, усли строка является палиндромом, в противном случае false
     */
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^\\p{L}\\p{N}]+", "").toLowerCase();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            String startPosition = String.valueOf(s.charAt(start));
            String endPosition = String.valueOf(s.charAt(end));

            if (!startPosition.equals(endPosition)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
