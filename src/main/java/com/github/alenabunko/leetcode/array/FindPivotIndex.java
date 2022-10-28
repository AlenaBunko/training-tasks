package com.github.alenabunko.leetcode.array;

import java.util.Arrays;

/**
 * Задача Найти опорный индекс
 * <a href="https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan&id=level-1">...</a>
 * Учитывая массив целых чисел, вычислить опорный индекс этого массива.
 * Опорный индекс — это индекс, в котором сумма всех чисел строго слева от индекса равна сумме всех чисел строго справа от индекса.
 * Если индекс находится на левом краю массива, то левая сумма равна 0, потому что слева нет элементов. Это также относится к правому краю массива.
 * Возвращает самый левый опорный индекс. Если такого индекса не существует, вернуть -1.
 * Ограничения:
 * 1 <= nums.length <= 10^4
 * -1000 <= nums[i] <= 1000
 */
public class FindPivotIndex {

    /**
     * Метод возвращает опорный индекс, если сумма всех чисел слева от индекса равна сумме всех чисел, находящихся справа.
     * Сам индекс не учитывается. Если же опорным индексом является первый, либо последний индекс массива, а сумма оставшихся элементов
     * массива равна 0, то возвращается данный индекс. Если опорный индекс не найден, возвращается -1
     *
     * @param nums исходный массив
     * @return опорный индекс, если сумма всех чисел слева от индекса равна сумме всех чисел, находящихся справа.
     * Сам индекс не учитывается. Если же опорным индексом является первый, либо последний индекс массива, а сумма оставшихся элементов
     * массива равна 0, то возвращается данный индекс. Если опорный индекс не найден, возвращается -1
     */
    public int pivotIndex(int[] nums) {

        if (Arrays.stream(nums).sum() - nums[0] == 0) {
            return 0;
        }

        int resultLeftIndex = 1;

        int sumLeft = nums[0];

        int sumRight = 0;
        for (int i = resultLeftIndex + 1; i < nums.length; i++) {
            sumRight += nums[i];
        }

        while (sumLeft != sumRight) {

            if (resultLeftIndex == nums.length - 1) {
                return sumLeft == 0 ? resultLeftIndex : -1;
            }

            sumLeft += nums[resultLeftIndex];
            resultLeftIndex++;
            sumRight -= nums[resultLeftIndex];
        }
        return resultLeftIndex;
    }
}
