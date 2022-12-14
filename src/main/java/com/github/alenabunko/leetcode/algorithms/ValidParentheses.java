package com.github.alenabunko.leetcode.algorithms;

import java.util.Stack;

/**
 * Задача Допустимые скобки
 * <a href="https://leetcode.com/problems/valid-parentheses/">...</a>
 * Учитывая строку s, содержащую только символы '(', ')', '{', '}', '[' и ']', определите, допустима ли входная строка.
 * Входная строка действительна, если:
 * Открытые скобки должны быть закрыты однотипными скобками.
 * Открытые скобки должны быть закрыты в правильном порядке.
 * Каждой закрывающей скобке соответствует открытая скобка того же типа.
 * Ограничения:
 * 1 <= s.length <= 10^4
 * s состоит только из круглых скобок '()[]{}'.
 */
public class ValidParentheses {

    /**
     * Метод возвращает true, если входная строка допустима, т.е. все открытые скобки закрыты в правильном порядке и соответствует типу,
     * в противном случае false
     *
     * @param s входная строка
     * @return True, если входная строка допустима, т.е. все открытые скобки закрыты в правильном порядке и соответствует типу,
     * в противном случае false
     */
    public boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isOpenBracket(c)) {
                stack.push(c);
            } else if (stack.empty()) {
                return false;
            } else if (!isValidPair(stack.pop(), c)) {
                return false;
            }
        }
        return stack.empty();
    }

    boolean isOpenBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    boolean isValidPair(char left, char right) {
        return (left == '(' && right == ')')
            || (left == '{' && right == '}')
            || (left == '[' && right == ']');
    }
}