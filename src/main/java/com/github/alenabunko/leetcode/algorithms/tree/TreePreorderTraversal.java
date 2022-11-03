package com.github.alenabunko.leetcode.algorithms.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Задача Обход предварительного порядка N-арного дерева
 * <a href="https://leetcode.com/problems/n-ary-tree-preorder-traversal/description/?envType=study-plan&id=level-1">...</a>
 * Учитывая корень n-арного дерева, вернуть предварительный обход значений его узлов.
 * Сериализация ввода Nary-Tree представлена в их обходе по уровням. Каждая группа детей отделена нулевым значением
 * Ограничения:
 * Количество узлов в дереве находится в диапазоне [0, 10^4]
 * 0 <= Node.val <= 10^4
 * Высота n-арного дерева меньше или равна 1000.
 */
public class TreePreorderTraversal {

    List<Integer> result = new ArrayList<>();

    /**
     * Метод возвращает список значений узлов дерева
     *
     * @param root n-арное дерево
     * @return список значений узлов дерева
     */
    public List<Integer> preorder(Node root) {

        if (root == null) {
            return result;
        }

        result.add(root.val);

        if (root.children != null) {
            for (Node node : root.children) {
                preorder(node);
            }
        }
        return result;
    }
}
