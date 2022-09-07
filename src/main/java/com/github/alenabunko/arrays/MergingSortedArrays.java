package com.github.alenabunko.arrays;

/**
 * Задача 1.1 Слияние двух упорядоченных массивов
 * Имеется два строго неубывающих числовых массива (каждый последующий элемент больше либо равен предыдущему).
 * Требуется получить третий строго неубывающий массив путём слияния первых двух.
 * Требования и ограничения:
 * типы массивов - int[]
 * сложность решения по времени - O(N)
 */
public class MergingSortedArrays {

    /**
     * Метод выполняет слияние двух упорядоченных массивов а и b
     *
     * @param a первый упорядоченный массив
     * @param b второй упорядоченный массив
     * @return упорядоченный массив, полученный в результате слияния двух исходных массивов
     */
    public static int[] mergeArr(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int r = 0;

        int aIndex = 0;
        int bIndex = 0;

        while (aIndex < a.length && bIndex < b.length) {
            int value = Math.min(a[aIndex], b[bIndex]);
            if (value == a[aIndex]) {
                aIndex++;
            } else {
                bIndex++;
            }
            result[r++] = value;
        }

        int from;
        int[] rest;

        if (aIndex < a.length) {
            rest = a;
            from = aIndex;
        } else {
            rest = b;
            from = bIndex;
        }

        while (from < rest.length) {
            result[r++] = rest[from++];
        }

        return result;
    }
}

