package com.github.alenabunko.leetcode.algorithms;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Задача Построить массив с операциями стека
 * <a href="https://leetcode.com/problems/build-an-array-with-stack-operations/description/">...</a>
 * Дан массив чисел и целое число n. Используя две операции со стеком, необходимо вернуть список, в котором значения, находящиеся
 * в массиве отражались как "Push", отсутствующие элементы - "Push", "Pop". Если последний элемент массива не равен n,
 * значит этот элемент будет последним
 * Ограничения:
 * 1 <= target.length <= 100
 * 1 <= n <= 100
 * 1 <= target[i] <= n
 * Массив строго увеличивается.
 */
public class BuildArrayWithStackOperations {

    /**
     * Метод возвращает список, который состоит из операций со стеком "Push" и "Pop" в зависимости от значений массива и числа n.
     * Последний элемент массива должен быть меньше либо равен n, если он меньше, то список дальше не заполняется
     *
     * @param target исходный массив
     * @param n      целое число
     * @return список, в котором "Push", если элемент присутствует в массиве и меньше n, либо "Push" и "Pop" - если элемент отсутствует в массиве
     * и меньше n
     */
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>(Arrays.stream(target).boxed().collect(Collectors.toUnmodifiableSet()));

        for (int i = 1; i <= target[target.length - 1]; i++) {
            if (i <= n) {
                if (set.contains(i)) {
                    result.add("Push");
                } else {
                    result.add("Push");
                    result.add("Pop");
                }
            }
        }
        return result;
    }
}
