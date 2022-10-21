package com.github.alenabunko.leetcode.array;

/**
 * Задача Медиана двух отсортированных массивов
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/description/">...</a>
 * Учитывая два отсортированных массива nums1 и nums2 размера m и n соответственно, вернуть медиану двух отсортированных массивов.
 * Общая сложность времени выполнения должна быть O(log (m+n)).
 * Ограничения:
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -10^6 <= nums1[i], nums2[i] <= 10^6
 */
public class MedianOfTwoSortedArrays {

    /**
     * Метод возвращает медиану двух отсортированных массивов
     *
     * @param nums1 первый исходный массив
     * @param nums2 второй исходный массив
     * @return медиану двух отсортированных массивов
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int totalSize = nums1.length + nums2.length;

        int[] res = new int[totalSize];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < totalSize; i++) {
            if (index1 == nums1.length) {
                res[i] = nums2[index2];
                index2++;
            } else if (index2 == nums2.length) {
                res[i] = nums1[index1];
                index1++;
            } else if (nums1[index1] < nums2[index2]) {
                res[i] = nums1[index1];
                index1++;
            } else {
                res[i] = nums2[index2];
                index2++;
            }
        }

        if (totalSize % 2 == 0) {
            return (double) (res[(totalSize - 1) / 2] + res[totalSize / 2]) / 2;
        }
        return res[totalSize / 2];
    }
}
