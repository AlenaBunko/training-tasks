package com.github.alenabunko.leetcode;

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

        boolean isCorrect = true;

        for (char[] chars : board) {
            for (int j = 0; j < chars.length; j++) {
                for (int n = 0; n < board.length; n++) {
                    if (chars[j] == chars[n] && chars[j] != '.' && j != n) {
                        isCorrect = false;
                        break;
                    }
                }
            }
        }

        for (int c = 0; c < board.length; c++) {
            for (int m = 0; m < board[c].length; m++) {
                for (int r = 0; r < board.length; r++) {
                    if (board[m][c] == board[r][c] && board[m][c] != '.' && m != r) {
                        isCorrect = false;
                        break;
                    }
                }
            }
        }

        return isCorrect;
    }
}
