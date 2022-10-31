package com.github.alenabunko.leetcode.algorithms.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    MergeTwoSortedLists merge = new MergeTwoSortedLists();


    @Test
    void testDifferetnNodes() {
        MergeTwoSortedLists.ListNode list1 = new MergeTwoSortedLists.ListNode(1,
            new MergeTwoSortedLists.ListNode(2,
                new MergeTwoSortedLists.ListNode(4)));
        MergeTwoSortedLists.ListNode list2 = new MergeTwoSortedLists.ListNode(1,
            new MergeTwoSortedLists.ListNode(3,
                new MergeTwoSortedLists.ListNode(4)));
        assertEquals(1, merge.mergeTwoLists(list1, list2).val);


        MergeTwoSortedLists.ListNode list3 = new MergeTwoSortedLists.ListNode();
        MergeTwoSortedLists.ListNode list4 = new MergeTwoSortedLists.ListNode();
        assertEquals(0, merge.mergeTwoLists(list3, list4).val);

        MergeTwoSortedLists.ListNode listNode = new MergeTwoSortedLists.ListNode();
        MergeTwoSortedLists.ListNode listNode1 = new MergeTwoSortedLists.ListNode(0);
        assertEquals(0, merge.mergeTwoLists(listNode, listNode1).val);

    }
}