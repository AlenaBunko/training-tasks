package com.github.alenabunko.arrays;

/**
 * Задача 1.3 Сортировка массива пузырьком
 */
public class BubbleSortArray {

    /**
     * Метод сортирует массив а путем сравнения ближайших двух элементов
     *
     * @param a - исходный массив
     * @return отсортированный массив
     */

    public static int[] bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        return a;
    }
}
