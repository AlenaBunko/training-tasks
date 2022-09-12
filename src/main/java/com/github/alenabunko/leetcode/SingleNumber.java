package com.github.alenabunko.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Учитывая непустой массив целых чисел nums, каждый элемент появляется дважды, кроме одного. Найди ту единственную.
 * Вы должны реализовать решение с линейной сложностью времени выполнения и использовать только постоянное дополнительное пространство.
 * Ограничения:
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * Каждый элемент в массиве появляется дважды, за исключением одного элемента, который появляется только один раз.
 */
public class SingleNumber {

    /**
     * Метод находит единственный неповторяющийся элемент массива
     *
     * @param nums исходный массив
     * @return уникальный элемент
     */
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int result = 0;

        if (nums.length == 1) {
            return nums[0];
        }

        for (int num : nums) {
            int count = 0;
            for (int i : nums) {
                if (num == i) {
                    count++;
                }
            }
            hm.put(count, num);
        }
        Set<Map.Entry<Integer, Integer>> set = hm.entrySet();

        for (Map.Entry<Integer, Integer> integerEntry : set) {
            if (integerEntry.getKey() == 1) {
                result = integerEntry.getValue();
            }
        }
        return result;
    }
}
