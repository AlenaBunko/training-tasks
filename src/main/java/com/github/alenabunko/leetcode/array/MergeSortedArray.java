package com.github.alenabunko.leetcode.array;

import java.util.Arrays;

/**
 * Задача Объединить отсортированный массив
 * <a href="https://leetcode.com/problems/merge-sorted-array/">...</a>
 * Даны два массива nums1 и nums2, отсортированные в неубывающем порядке, и два числа m и n, представляющие
 * количество элементов в nums1 и nums2 соответственно.
 * Объедините nums1 и nums2 в один массив, отсортированный в неубывающем порядке.
 * Окончательный отсортированный массив не должен возвращаться функцией, а должен храниться внутри массива nums1.
 * Чтобы приспособиться к этому, nums1 имеет длину m + n, где первые m элементов обозначают элементы, которые должны быть объединены,
 * а последние n элементов устанавливаются равными 0 и должны игнорироваться. nums2 имеет длину n.
 */
public class MergeSortedArray {

    /**
     * Метод объединяет два массива, заменяя количество n элементов массива nums1, равных 0 (и длине массива nums2),
     * значениями второго массива nums2
     *
     * @param nums1 первый массив
     * @param m     количество ненулевых элементов массива nums1
     * @param nums2 второй массив
     * @param n     длина второго массива
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int j = m;
        int i = 0;

        while (i < n) {
            if (nums1[j] == 0) {
                nums1[j] = nums2[i];
                i++;
            }
            j++;
        }
        Arrays.sort(nums1);
    }
}
