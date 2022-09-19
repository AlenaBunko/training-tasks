package com.github.alenabunko.leetcode;

/**
 * Задача Перемещение нулей
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/">...</a>
 * Дан массив nums, переместите все 0 в его конец, сохраняя относительный порядок ненулевых элементов.
 * Обратите внимание, что вы должны сделать это на месте, не создавая копию массива.
 * Ограничения:
 * 1 <= nums.length <= 104
 * -2^31 <= nums[i] <= 2^31 - 1
 */
public class MoveZeroes {

    /**
     * Метод перемещает все нули в конец массива, сохраняя относительный порядок ненулевых элементов
     *
     * @param nums исходный массив
     */
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }

    }
}
