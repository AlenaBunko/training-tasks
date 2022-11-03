package com.github.alenabunko.leetcode.algorithms.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreePreorderTraversalTest {

    TreePreorderTraversal treePreorderTraversal = new TreePreorderTraversal();

    @Test
    void testDifferentNodes() {
        List<Node> oneList = new ArrayList<>();
        oneList.add(new Node(5));
        oneList.add(new Node(6));

        List<Node> rootList = new ArrayList<>();
        rootList.add(new Node(3, oneList));
        rootList.add(new Node(2));
        rootList.add(new Node(4));

        Node root = new Node(1, rootList);

        List<Integer> actualList = treePreorderTraversal.preorder(root);
        List<Integer> expectedList = Arrays.asList(1, 3, 5, 6, 2, 4);

        assertEquals(expectedList, actualList);
    }

}