package com.github.alenabunko.leetcode.algorithms.tree;

import com.github.alenabunko.leetcode.algorithms.tree.BinaryTreeLevelOrderTraversal.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalTest {

    BinaryTreeLevelOrderTraversal binaryTree = new BinaryTreeLevelOrderTraversal();

    @Test
    void testDifferentValuesOfTree() {

        TreeNode root = new TreeNode(3,
            new TreeNode(9),
            new TreeNode(20,
                new TreeNode(15), new TreeNode(7)));

        List<List<Integer>> actual = binaryTree.levelOrder(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(3));
        expected.add(List.of(9, 20));
        expected.add(List.of(15, 7));

        assertEquals(actual, expected);

        TreeNode root1 = new TreeNode(1);
        List<List<Integer>> actual1 = binaryTree.levelOrder(root1);
        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(List.of(1));

        assertEquals(actual1, expected1);

        TreeNode emptyNode = new TreeNode();
        List<List<Integer>> actualEmpty = binaryTree.levelOrder(emptyNode);
        List<List<Integer>> expectedEmpty = new ArrayList<>();

        assertEquals(actualEmpty, expectedEmpty);
    }
}