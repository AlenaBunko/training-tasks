package com.github.alenabunko.leetcode.string;

/**
 * Число палиндрома
 * <a href="https://leetcode.com/problems/palindrome-number/">...</a>
 * Дано число x, вернуть true, если x является целым палиндромом.
 * Целое число является палиндромом, если оно читается так же, как в прямом, так и в обратном порядке.
 * Ограничения:
 * -2^31 <= x <= 2^31 - 1
 */
public class PalindromeNumber {

    /**
     * Метод возвращает true, если число является палиндромом
     *
     * @param x целое число
     * @return true, если x палиндром, в обратном случае - false
     */
    public boolean isPalindrome(int x) {
        String result = String.valueOf(x);
        int start = 0;
        int end = result.length() - 1;
        while (start < end) {
            if (result.charAt(start++) != result.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
