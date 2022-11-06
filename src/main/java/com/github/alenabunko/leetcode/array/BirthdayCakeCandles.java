package com.github.alenabunko.leetcode.array;

import java.util.List;
import java.util.TreeMap;

/**
 * Задача Свечи для торта ко дню рождения
 * <a href="https://www.hackerrank.com/challenges/birthday-cake-candles/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=60-day-campaign">...</a>
 * Вы отвечаете за торт на день рождения ребенка. На торте будет по одной свече на каждый год возраста.
 * Можно задуть только самую высокую из свечей. Подсчитайте, сколько свечей самые высокие.
 * Функция принимает в качестве параметра свечи INTEGER_ARRAY.
 * Ограничения:
 * 1<=n<=10^5
 * 1<=candles[i]<=10^7
 */
public class BirthdayCakeCandles {

    /**
     * Метод возвращает количество свечей, которые являются самыми высокими
     *
     * @param candles список, которые содержит длины свечей
     * @return количество свечей, которые являются самыми высокими
     */
    public static int birthdayCakeCandles(List<Integer> candles) {
        if (candles.size() == 1) {
            return 1;
        }

        TreeMap<Integer, Integer> sortCandles = new TreeMap<>();

        for (Integer i : candles) {
            sortCandles.put(i, 1 + sortCandles.getOrDefault(i, 0));
        }
        return sortCandles.get(sortCandles.lastKey());
    }
}
