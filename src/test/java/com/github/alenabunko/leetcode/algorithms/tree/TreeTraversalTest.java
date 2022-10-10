package com.github.alenabunko.leetcode.algorithms.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeTraversalTest {

    TreeTraversal treeTraversal = new TreeTraversal();

    @Test
    void testDifferentValuesOfNode() {
        Node root = new Node(1,
            new ArrayList<>(Arrays.asList(
                                new Node(3, new ArrayList<>(List.of(
                                          new Node(5),
                                          new Node(6)))),
                                new Node(2),
                                new Node(4))));

        List<List<Integer>> actual = treeTraversal.levelOrder(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1));
        expected.add(List.of(3, 2, 4));
        expected.add(List.of(5, 6));

        assertEquals(expected, actual);

        root = new Node(1,
            new ArrayList<>(List.of(
                            new Node(2),
                            new Node(3, new ArrayList<>(List.of(
                                     new Node(6),
                                     new Node(7, new ArrayList<>(List.of(
                                              new Node(11, new ArrayList<>(List.of(
                                                       new Node(14)))))))))),
                            new Node(4, new ArrayList<>(List.of(
                                     new Node(8, new ArrayList<>(List.of(
                                              new Node(12))))))),
                            new Node(5, new ArrayList<>(List.of(
                                     new Node(9, new ArrayList<>(List.of(
                                              new Node(13)))),
                                     new Node(10)))))));


        actual = treeTraversal.levelOrder(root);
        expected = new ArrayList<>();
        expected.add(List.of(1));
        expected.add(List.of(2, 3, 4, 5));
        expected.add(List.of(6, 7, 8, 9, 10));
        expected.add(List.of(11, 12, 13));
        expected.add(List.of(14));

        assertEquals(expected, actual);

        root = null;
        actual = treeTraversal.levelOrder(root);
        expected = new ArrayList<>();

        assertEquals(actual, expected);
    }

}