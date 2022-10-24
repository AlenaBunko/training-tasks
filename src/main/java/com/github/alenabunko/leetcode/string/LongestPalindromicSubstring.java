package com.github.alenabunko.leetcode.string;

/**
 * Задача Самая длинная палиндромная подстрока
 * <a href="https://leetcode.com/problems/longest-palindromic-substring/description/">...</a>
 * Учитывая строку s, вернуть самую длинную палиндромную подстроку в s.
 * Ограничения:
 * 1 <= s.length <= 1000
 * s состоят только из цифр и английских букв.
 */
public class LongestPalindromicSubstring {

    /**
     * Метод возвращает самую длинную палиндромную подстроку
     *
     * @param s строка
     * @return самую длинную палиндромную подстроку
     */
    public String longestPalindrome(String s) {

        if (s.length() == 1) {
            return s;
        }

        String result = "";

        for (int startIndex = 0; startIndex < s.length(); startIndex++) {
            for (int endIndex = s.length() - 1; endIndex >= startIndex; endIndex--) {
                if (s.charAt(startIndex) == s.charAt(endIndex)) {

                    int tempLength = endIndex - startIndex + 1;

                    if (tempLength < result.length()) {
                        break;
                    }

                    String tempResult = s.substring(startIndex, endIndex + 1);
                    int tempStartIndex = 0;
                    int tempEndIndex = tempResult.length() - 1;

                    boolean isFlag = true;

                    while (tempStartIndex < tempEndIndex) {
                        if (tempResult.charAt(tempStartIndex) != tempResult.charAt(tempEndIndex)) {
                            isFlag = false;
                            break;
                        }
                        tempStartIndex++;
                        tempEndIndex--;
                    }

                    if (isFlag) {
                        result = tempResult;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
