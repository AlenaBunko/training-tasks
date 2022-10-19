package com.github.alenabunko.leetcode.string;

/**
 * Задача Поменять гласные в строке
 * <a href="https://leetcode.com/problems/reverse-vowels-of-a-string/description/">...</a>
 * Учитывая строку s, инвертировать только все гласные в строке и вернуть ее.
 * Гласные 'а', 'е', 'i', 'о' и 'u' могут появляться как в нижнем, так и в верхнем регистре более одного раза.
 * Ограничения:
 * 1 <= s.length <= 3 * 10^5
 * строка s состоит из печатных символов ASCII.
 */
public class ReverseVowelsOfString {

    /**
     * Метод возвращает строку, в которой гласные, начиная с начала строки, заменены гласными, идущими с конца строки
     *
     * @param s строка
     * @return строку, в которой гласные, начиная с начала строки, заменены гласными, идущими с конца строки
     */
    public String reverseVowels(String s) {
        StringBuilder temp = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                temp.append(s.charAt(i));
            }
        }

        int indexSB = temp.length() - 1;

        for (
            int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                result.append(temp.charAt(indexSB--));
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    boolean isVowel(char c) {
        boolean isVowel = false;
        switch (c) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> isVowel = true;
        }
        return isVowel;
    }
}
