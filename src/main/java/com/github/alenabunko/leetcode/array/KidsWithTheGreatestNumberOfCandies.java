package com.github.alenabunko.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Дети с наибольшим количеством конфет
 * Есть n детей с конфетами. Вам дан целочисленный массив конфет candies, где каждая конфета[i] представляет количество конфет,
 * которое есть у i-го ребенка, и целое число extraCandies, обозначающее количество дополнительных конфет, которые у вас есть.
 * Нужно вернуть результат логического массива длины n, где результат[i] равен true, если после передачи i-му ребенку всех
 * extraCandies у него будет наибольшее количество конфет среди всех детей, или false в противном случае.
 * Обратите внимание, что несколько детей могут иметь наибольшее количество конфет.
 * Ограничения:
 * n == candies.length
 * 2 <= n <= 100
 * 1 <= candies[i] <= 100
 * 1 <= extraCandies <= 50
 */
public class KidsWithTheGreatestNumberOfCandies {

    /**
     * Метод сравнивает общее количество конфет с наибольшим количеством конфет i-го ребенка в исходном массиве candies
     *
     * @param candies      исходный целочисленный массив конфет
     * @param extraCandies количество дополнительных конфет, которое нужно отдать каждому ребенку
     * @return спискок элементов типа Boolean c элементами true, если общее количество конфет больше наибольшего количества конфет,
     * в противном случае элемент false
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> maxNumberOfCandies = new ArrayList<>();

        int maxElement = Arrays.stream(candies).max().orElse(0);

        for (int allCandiesOneChild : candies) {
            int tempElement = allCandiesOneChild + extraCandies;

            boolean b = tempElement >= maxElement;
            maxNumberOfCandies.add(b);
        }
        return maxNumberOfCandies;
    }
}
