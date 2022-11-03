package com.github.alenabunko.leetcode.algorithms.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Задача Обход порядка двоичного дерева
 * <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/description/?envType=study-plan&id=level-1">...</a>
 * Учитывая корень бинарного дерева, верните порядок обхода его значений узлов. (то есть слева направо, уровень за уровнем).
 * Ограничения:
 * Количество узлов в дереве находится в диапазоне [0, 2000].
 * -1000 <= Node.val <= 1000
 */
public class BinaryTreeLevelOrderTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * Метод возвращает список значений узлов слева направо уровень за уровнем
     *
     * @param root двоичное дерево
     * @return список значений узлов слева направо уровень за уровнем
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root.val == 0) {
            return result;
        }
        List<TreeNode> currentList = new ArrayList<>();
        currentList.add(root);

        while (currentList.size() > 0) {
            List<Integer> temp = new ArrayList<>();
            for (TreeNode node : currentList) {
                temp.add(node.val);
            }

            result.add(new ArrayList<>(temp));

            List<TreeNode> previousList = currentList;
            currentList = new ArrayList<>();

            for (TreeNode node : previousList) {
                if (node.left != null) {
                    currentList.add(node.left);
                }
                if (node.right != null) {
                    currentList.add(node.right);
                }
            }
        }

        return result;
    }
}
