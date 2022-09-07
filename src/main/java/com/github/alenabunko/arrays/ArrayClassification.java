package com.github.alenabunko.arrays;

/**
 * Задача 1.5 Классификация массива
 * Имеется массив чисел (int[]).
 * Требуется реализовать функцию, выполняющую классификацию массива путём определения принадлежности к одной из групп (в порядке убывания приоритета):
 * empty - если массив пуст
 * constant - если все элементы массива равны
 * increasing - если массив упорядочен по возрастанию (a[n-1]  <= a[n])
 * decreasing - если массив упорядочен по убыванию (a[n-1]  >= a[n])
 * other - в иных случаях
 * Требования и ограничения:
 * реализация должна использовать всего один проход по массиву
 */
public class ArrayClassification {

    /**
     * Метод классифицирует массив a по категориям, сравнивания находящиеся рядом два элемента
     *
     * @param a исходный массив
     * @return классификатор массива по типу String
     */
    public static String classify(int[] a) {
        if (a.length == 0) {
            return "empty";
        }

        boolean hasIncrease = false;
        boolean hasDecrease = false;

        for (int i = 0; i < a.length - 1; i++) {
            int compare = Integer.compare(a[i], a[i + 1]);

            hasIncrease |= compare < 0;
            hasDecrease |= compare > 0;
        }

        if (hasIncrease && hasDecrease) {
            return "other";
        }
        if (hasIncrease) {
            return "increasing";
        }
        if (hasDecrease) {
            return "decreasing";
        }
        return "constant";
    }
}