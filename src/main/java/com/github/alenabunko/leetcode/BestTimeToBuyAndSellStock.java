package com.github.alenabunko.leetcode;

/**
 * Вам дан целочисленный массив, prices, где prices[i] цена данной акции в день i
 * Каждый день вы можете решить купить и/или продать акции. В любой момент времени вы можете владеть не более, чем одной акцией.
 * Однако вы можете купить его и тут же продать в тот же день.
 * Найдите и верните максимальную прибыль, которую вы можете получить .
 * Ограничения:
 * 1 <= prices.length <= 3 * 10^4
 * 0 <= prices[i] <= 10^4
 */
public class BestTimeToBuyAndSellStock {

    /**
     * Метод сравнивает последовательные элементы массива и вычисляет максимально возможное значение, полученное
     * суммирование разницы последовательных значений в случае, если следующее за элементом значение больше предыдущего
     *
     * @param prices исходный массив
     * @return сумму разницы последовательных элементов
     */
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                int purchasePrice = prices[i];
                int sellingPrice = prices[i + 1];
                profit += (sellingPrice - purchasePrice);
            }
        }
        return profit;

    }
}
