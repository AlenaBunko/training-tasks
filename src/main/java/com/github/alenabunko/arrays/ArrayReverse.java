package com.github.alenabunko.arrays;

/**
 * Задача 1.2 Переворот массива
 * Имеется массив чисел.
 * Требуется перевернуть исходный массив так, чтобы его элементы шли в обратном порядке.
 */
public class ArrayReverse {

    /**
     * Метод выполняет переворот исходного массива а
     *
     * @param a исходный массив
     */
    public static void flip(int[] a) {

        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
    }
}
