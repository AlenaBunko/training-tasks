package com.github.alenabunko.leetcode.array;

/**
 * Дан отсортированный массив nums, удалите дубликаты на месте, чтобы каждый уникальный элемент появлялся только один раз.
 * Относительный порядок элементов должен быть сохранен.
 * Поскольку в некоторых языках невозможно изменить длину массива, вместо этого вы должны поместить результат в первую часть массива nums.
 * Более формально, если есть k-элементы после удаления дубликатов, то первые k-элементы nums должны содержать окончательный результат.
 * Неважно, что вы оставите за пределами первых k элементов.
 * Возврат k после размещения конечного результата в первых k-слотах nums.
 * Не выделяйте дополнительное пространство для другого массива. Вы должны сделать это, изменив входной массив на месте с дополнительной
 * памятью O (1).
 * Ограничения:
 * 1 <= nums.length <= 3 * 10^4
 * -100 <= nums[i] <= 100
 * nums сортируется в порядке возрастания.
 */

public class RemoveDuplicatesFromSortedArray {

    /**
     * Метод перезаписывает элементы в исходный массив без дубликатов
     *
     * @param nums исходный массив
     * @return количество элементов без дубликатов
     */
    public int decompressRLElist(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                count++;
            }
        }
        return count;
    }
}
