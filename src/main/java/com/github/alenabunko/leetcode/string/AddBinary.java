package com.github.alenabunko.leetcode.string;

/**
 * Задача Сумма двоичной строки
 * <a href="https://leetcode.com/problems/add-binary/">...</a>
 * Имея две двоичные строки a и b, верните их сумму в виде двоичной строки.
 * Ограничения:
 * 1 <= a.length, b.length <= 10^4
 * a и b состоят только из символов «0» или «1».
 * Каждая строка не содержит ведущих нулей, кроме самого нуля.
 */
public class AddBinary {

    /**
     * Метод возвращает сумму двоичных строк
     *
     * @param a первая двоичная строка
     * @param b вторая двоичная строка
     * @return сумма a и b в виде двоичной строки
     */
    public String addBinary(String a, String b) {
        if (a == null || b == null) {
            return " ";
        }

        int first = a.length() - 1;
        int second = b.length() - 1;

        StringBuilder sb = new StringBuilder();

        int carry = 0;

        while (first >= 0 || second >= 0) {
            int sum = carry;
            if (first >= 0) {
                sum += a.charAt(first) - '0';
                first--;
            }
            if (second >= 0) {
                sum += b.charAt(second) - '0';
                second--;
            }
            carry = sum >> 1;
            sum = sum & 1;
            sb.append(sum == 0 ? '0' : '1');
        }

        if (carry > 0) {
            sb.append('1');
        }

        sb.reverse();
        return String.valueOf(sb);
    }
}
