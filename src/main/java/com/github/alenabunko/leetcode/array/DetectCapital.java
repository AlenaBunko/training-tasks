package com.github.alenabunko.leetcode.array;

/**
 * Задача Обнаружить заглавную букву
 * <a href="https://leetcode.com/problems/detect-capital/description/">...</a>
 * Мы определяем использование заглавных букв в слове как правильное, когда имеет место один из следующих случаев:
 * Все буквы в этом слове заглавные, например, «США».
 * Все буквы в этом слове не заглавные, как и "leetcode".
 * Только первая буква в этом слове заглавная, как "Гугл".
 * Для заданного строкового слова вернуть true, если в нем используются заглавные буквы.
 * Ограничения:
 * 1 <= word.length <= 100
 * word состоит из строчных и прописных букв латинского алфавита.
 */
public class DetectCapital {

    /**
     * Метод возвращает true, если строка word содержит либо все заглавные, либо все строчные, либо только первую заглавную букву,
     * в противном случае false
     *
     * @param word строка
     * @return true, если строка word содержит либо все заглавные, либо все строчные, либо только первую заглавную букву,
     * в противном случае false
     */
    public boolean detectCapitalUse(String word) {

        int excludedIndex = word.length();

        if (excludedIndex == 1) {
            return true;
        }

        String substringWord = word.substring(1, excludedIndex);

        boolean hasUppercase = !word.equals(word.toUpperCase());
        boolean hasLowercase = !substringWord.equals(substringWord.toLowerCase());

        return !hasUppercase || !hasLowercase;
    }
}
