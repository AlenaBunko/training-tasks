package com.github.alenabunko.arrays;

/**
 * Задача 1.5 Классификация массива
 */
public class ArrayClassification {

    /**
     * Метод классифицирует массив a по категориям, сравнивания находящиеся
     * рядом два элемента
     *
     * @param a -исходный массив
     * @return классификатор массива по типу String
     */

    public static String classification(int[] a) {
        String result;

        if (a.length == 0) {
            return "empty";
        }

        for (int i = 1; i < a.length - 1; i++) {

            if ((a[i - 1] <= a[i] && a[i] > a[i + 1]) || (a[i - 1] >= a[i] && a[i] < a[i + 1])) {
                return "other";
            }
        }

        if (a[0] < a[a.length - 1]) {
            result = "increasing";
        } else if (a[0] > a[a.length - 1]) {
            result = "decreasing";
        } else {
            result = "constant";
        }

        return result;
    }
}
