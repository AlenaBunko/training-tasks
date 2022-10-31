package com.github.alenabunko.leetcode.algorithms.tree;

/**
 * Задача Объединить два отсортированных списка
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=study-plan&id=level-1">...</a>
 * Вам даны заголовки двух отсортированных связанных списков list1 и list2.
 * Объедините два списка в один отсортированный список. Список должен быть составлен путем соединения узлов первых двух списков.
 * Возвращает заголовок объединенного связанного списка.
 * Ограничения:
 * Количество узлов в обоих списках находится в диапазоне [0, 50].
 * -100 <= Node.val <= 100
 * И list1, и list2 сортируются в неубывающем порядке.
 */
public class MergeTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Метод возвращает заголовок объединенного связанного списка
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return заголовок объединенного связанного списка
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result;

        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            result = list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            result = list2;
        }
        return result;
    }
}
