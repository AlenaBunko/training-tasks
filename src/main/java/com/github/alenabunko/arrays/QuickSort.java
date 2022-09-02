package com.github.alenabunko.arrays;

/**
 * Задача 1.4 Быстрая сортировка массива
 */
public class QuickSort {

    /**
     * Метод реализует быструю сортировку массива а
     *
     * @param a     - исходный массив
     * @param from- начальный элемент массива
     * @param to    - конечный элемент массива
     * @return отсортированный массив
     */
    public static int[] quick(int[] a, int from, int to) {

        if (from < to) {
            int divideIndex = partition(a, from, to);
            quick(a, from, divideIndex - 1);
            quick(a, divideIndex, to);
        }

        return a;
    }

    private static int partition(int[] a, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = a[from];
        while (leftIndex <= rightIndex) {
            while (a[leftIndex] < pivot) {
                leftIndex++;
            }

            while (a[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(a, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] a, int rightIndex, int leftIndex) {
        int temp = a[rightIndex];
        a[rightIndex] = a[leftIndex];
        a[leftIndex] = temp;
    }
}
