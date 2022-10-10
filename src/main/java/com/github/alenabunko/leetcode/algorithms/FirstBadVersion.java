package com.github.alenabunko.leetcode.algorithms;

/**
 * Задача Первая плохая версия
 * <a href="https://leetcode.com/problems/first-bad-version/description/">...</a>
 * Вы менеджер по продукту и в настоящее время возглавляете команду по разработке нового продукта. К сожалению, последняя
 * версия вашего продукта не прошла проверку качества. Поскольку каждая версия разрабатывается на основе предыдущей версии,
 * все версии после плохой версии тоже плохие.
 * Предположим, у вас есть n версий [1, 2, ..., n] и вы хотите найти первую плохую версию, из-за которой все последующие будут плохими.
 * Вам предоставляется bool API isBadVersion (версия), который возвращает, является ли версия плохой. Реализуйте функцию
 * для поиска первой плохой версии. Вы должны свести к минимуму количество обращений к API.
 * Ограничения:
 * 1 <= bad <= n <= 2^31 - 1
 */
public class FirstBadVersion extends VersionControl {
    public FirstBadVersion(int n, int badVersion) {
        super(n, badVersion);
    }

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    /**
     * Метод возвращает номер первой плохой версии
     *
     * @param n номер последней версии
     * @return номер первой плохой версии
     */
    public int firstBadVersion(int n) {
        int firstVersion = 1;
        int endVersion = n;

        while (firstVersion < endVersion) {
            int mid = firstVersion + (endVersion - firstVersion) / 2;
            if (isBadVersion(mid)) {
                endVersion = mid;
            } else {
                firstVersion = mid + 1;
            }
        }
        return firstVersion;
    }
}
