package com.github.alenabunko.leetcode.array;

/**
 * Задача Удалить элемент
 * <a href="https://leetcode.com/problems/remove-element/">...</a>
 * Дан массив nums и число val, удалите все вхождения val в nums на месте. Относительный порядок элементов может быть изменен.
 * Поскольку в некоторых языках невозможно изменить длину массива, вместо этого вы должны поместить результат в первую часть массива nums.
 * Более формально, если есть k элементов после удаления дубликатов, то первые k элементов nums должны содержать окончательный результат. Неважно, что вы оставляете за первыми k элементами.
 * Возвратите k после размещения окончательного результата в первых k слотах nums.
 * Не выделяйте дополнительное пространство для другого массива. Вы должны сделать это, изменив входной массив на месте
 * с дополнительной памятью O (1).
 * Ограничения:
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 50
 * 0 <= val <= 100
 */
public class RemoveElement {

    /**
     * Метод возвращает количество элементов в массиве nums после удаления всех вхождений числа val.
     *
     * @param nums исходный массив
     * @param val  число, которое необходимо удалить
     * @return количество элементов в массиве nums после удаления всех вхождений числа val
     */
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int n = 0; n < nums.length; n++) {
            if (nums[n] != val) {
                nums[i] = nums[n];
                i++;
            }
        }
        return i;
    }
}
