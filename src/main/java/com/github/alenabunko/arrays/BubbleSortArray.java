package com.github.alenabunko.arrays;

/**
 * Задача 1.3 Сортировка массива пузырьком
 * Имеется массив чисел (int[]).
 * Требуется реализовать сортировку исходного массива, используя алгоритм сортировки пузырьком.
 */
public class BubbleSortArray {

    /**
     * Метод сортирует массив а путем сравнения ближайших двух элементов
     *
     * @param a исходный массив
     */
    public static void sort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
