package com.github.alenabunko.arrays;

/**
 * Задача 1.2 Переворот массива
 */

public class ArrayReverse {
    /**
     * Метод выполняет переворот исходного массива а
     *
     * @param a - исходный массив
     * @return исходный массив с элементами, располагающимися в обратном порядке
     */
    public static int[] reverse(int[] a) {

        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }

        return a;
    }
}
