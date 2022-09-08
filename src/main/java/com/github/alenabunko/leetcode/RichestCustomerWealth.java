package com.github.alenabunko.leetcode;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

/**
 * Задача 1672 Богатство самого богатого клиента
 * Вам дано m x n целочисленных счетов сетки, где account[i][j] — сумма денег, которую i-ого клиента в j-том банке.
 * Верните богатство, которое есть у самого богатого клиента.
 * Богатство клиента — это сумма денег, которую он имеет на всех своих банковских счетах.
 * Ограничения:
 * m == accounts.length
 * n == accounts[i].length
 * 1 <= m, n <= 50
 * 1 <= accounts[i][j] <= 100
 */
public class RichestCustomerWealth {

    /**
     * Метод суммирует все деньги на счетах каждого из клиентов и выводит счет самого богатого клиента
     *
     * @param accounts счета клиентов в различных банках
     * @return сумма денег самого богатого клиента
     */
    public int maximumWealth(int[][] accounts) {

        TreeMap<Integer, Integer> customerAccount = new TreeMap<>();

        int customer = 0;

        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            customer += 1;
            customerAccount.put(customer, wealth);
        }

        Optional<Map.Entry<Integer, Integer>> maxEntry = customerAccount.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        return (maxEntry.isPresent()) ? maxEntry.get().getValue() : 0;
    }
}
