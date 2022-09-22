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
        boolean isTrue = false;
        if (x >= 0) {
            String s = String.valueOf(x);
            for (int i = 0; i <= s.length() / 2; ) {
                for (int j = s.length() - 1; j >= s.length() / 2; j--) {
                    if (s.charAt(i) != s.charAt(j)) {
                        return false;
                    }
                    i++;
                }
                isTrue = true;
            }
        }
        return isTrue;
    }
}
