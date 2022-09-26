package com.github.alenabunko.leetcode.algorithms;

/**
 * Задача Поиск позиции вставки
 * <a href="https://leetcode.com/problems/search-insert-position/">...</a>
 * Учитывая отсортированный массив различных целых чисел и целевое значение, вернуть индекс, если цель найдена.
 * Если нет, верните индекс туда, где он был бы, если бы он был вставлен по порядку.
 * Вы должны написать алгоритм со сложностью выполнения O(log n).
 * Ограничения:
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * массив содержит различные значения, отсортированные в порядке возрастания
 * -10^4 <= target <= 10^4
 */
public class SearchInsertPosition {

    /**
     * Метод возвращает позицию числа в массиве либо, при отсутствии в массиве данного числа, необходимый номер позиции, который не нарушит
     * порядок элементов в массиве
     *
     * @param nums   исходный массив
     * @param target искомое число
     * @return позиция искомого числа в массиве
     */
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else {
                if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return end + 1;
    }
}
