package com.github.alenabunko.leetcode.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Задача Счастливый номер
 * <a href="https://leetcode.com/problems/happy-number/">...</a>
 * Написать алгоритм, определяющий, является ли число n счастливым.
 * Счастливое число — это число, определяемое следующим процессом:
 * Начиная с любого положительного целого числа, замените число суммой квадратов его цифр.
 * Повторяйте процесс до тех пор, пока число не станет равным 1 (где оно и останется), или пока он не будет бесконечно повторяться в цикле, который не включает 1.
 * Те числа, для которых этот процесс заканчивается на 1, счастливы.
 * Возвращает true, если n — счастливое число, и false, если нет.
 * Ограничения:
 * 1 <= n <= 2^31 - 1
 */
public class HappyNumber {

    /**
     * Метод возвращает true, если рассчитанная сумма квадратов цифр данного числа будет равна единице. Расчет производится до тех пор,
     * пока не достигнут результат в виде единицы, либо бесконечного цикла
     *
     * @param n число
     * @return true, если n — счастливое число, и false, если нет
     */
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n > 1) {

            if (seen.contains(n)) {
                return false;
            }

            seen.add(n);

            n = getSumOfSquaredDigits(n);

        }

        return true;
    }

    static int getSumOfSquaredDigits(int n) {
        int result = 0;
        while (n > 0) {
            result += Math.pow(n % 10, 2);
            n = n / 10;
        }
        return result;
    }
}
