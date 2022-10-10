package com.github.alenabunko.leetcode.algorithms.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversal {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrder(root, result);
        return result;
    }

    private void levelOrder(Node root, List<List<Integer>> result) {

        if (root == null) {
            return;
        }

        List<Node> currentLevelNodes = new ArrayList<>();
        currentLevelNodes.add(root);

        while (currentLevelNodes.size() > 0) {
            List<Integer> temp = new ArrayList<>();
            for (Node node : currentLevelNodes) {
                temp.add(node.val);
            }

            result.add(new ArrayList<>(temp));

            List<Node> prevLevelNodes = currentLevelNodes;

            currentLevelNodes = new ArrayList<>();

            for (Node node : prevLevelNodes) {
                if (node.children != null) {
                    currentLevelNodes.addAll(node.children);
                }
            }
        }
    }
}
