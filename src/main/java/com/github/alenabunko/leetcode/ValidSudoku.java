package com.github.alenabunko.leetcode;

import java.util.*;

/**
 * Задача Действительный судоку
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/">...</a>
 * Определите, действительна ли доска судоку 9 x 9. Только заполненные ячейки должны быть проверены в соответствии со
 * следующими правилами:
 * Каждая строка должна содержать цифры 1-9 без повторения.
 * Каждый столбец должен содержать цифры 1-9 без повторения.
 * Каждый из девяти подблоков сетки 3 x 3 должен содержать цифры 1-9 без повторения.
 * Примечание:
 * Доска судоку (частично заполненная) может быть действительной, но не обязательно решаемой.
 * Только заполненные ячейки должны быть проверены в соответствии с указанными правилами.
 * Ограничения:
 * board.length == 9
 * board[i].length == 9
 * board[i][j] это цифра от 1 до 9 или '.'.
 */
public class ValidSudoku {

    /**
     * Метод возвращает true, если в матрице столбец или строка не содержат повторяющиеся элементы, в противном случае false
     *
     * @param board исходная матрица
     * @return true, если элементы в столбце/строке не повторяются, в противном случае false
     */
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            if (hasDuplicates(getRowDigits(board, i)) || hasDuplicates(getColumnDigits(board, i))) {
                return false;
            }
            if (hasDuplicates(getBlockDigits(board, i))) {
                return false;
            }
        }
        return true;
    }

    boolean hasDuplicates(List<Integer> digits) {
        Set<Integer> uniqueDigits = new HashSet<>(digits);
        return uniqueDigits.size() != digits.size();
    }

    List<Integer> getRowDigits(char[][] board, int i) {
        List<Integer> result = new ArrayList<>();
        for (int n = 0; n < board.length; n++) {
            char c = board[i][n];
            if (c != '.') {
                result.add(Character.digit(c, 10));
            }
        }
        return result;
    }

    List<Integer> getColumnDigits(char[][] board, int i) {
        List<Integer> result = new ArrayList<>();
        for (int n = 0; n < board.length; n++) {
            char c = board[n][i];
            if (c != '.') {
                result.add(Character.digit(c, 10));
            }
        }
        return result;
    }

    List<Integer> getBlockDigits(char[][] board, int i) {
        List<Integer> result = new ArrayList<>();
        int startColIndex = (i % 3) * 3;
        int startRowIndex = (i / 3) * 3;
        int endColIndex = startColIndex + 3 - 1;
        int endRowIndex = startRowIndex + 3 - 1;
        for (int rowIndex = startRowIndex; rowIndex <= endRowIndex; rowIndex++) {
            for (int colIndex = startColIndex; colIndex <= endColIndex; colIndex++) {
                char c = board[rowIndex][colIndex];
                if (c != '.') {
                    result.add(Character.digit(c, 10));
                }
            }
        }
        return result;
    }
}