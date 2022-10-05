package com.github.alenabunko.leetcode.algorithms;

/**
 * Задача Вычислить однозначное число
 * <a href="https://leetcode.com/problems/add-digits/description">...</a>
 * Учитывая целое число, многократно добавляйте все его цифры, пока результат не будет иметь только одну цифру, и возвращайте его.
 * Ограничения:
 * 0 <= num <= 2^31 - 1
 */
public class AddDigits {

    /**
     * Метод возвращает результат суммирования цифр числа, когда результат суммирования станет равен числу, меньшему десяти
     *
     * @param num число
     * @return результат суммирования цифр числа num, равный значению, меньшему десяти
     */
    public int addDigits(int num) {
        return num < 10 ? num : 1 + (num - 1) % 9;
    }
}
