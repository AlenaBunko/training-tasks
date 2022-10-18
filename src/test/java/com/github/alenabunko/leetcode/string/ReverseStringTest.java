package com.github.alenabunko.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    ReverseString reverseString = new ReverseString();

    @Test
    void testDifferentStrings() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString.reverseString(s);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, s);

        s = new char[]{'a', 'b', 'b', 'a'};
        reverseString.reverseString(s);
        assertArrayEquals(new char[]{'a', 'b', 'b', 'a'}, s);

        s = new char[]{'r'};
        reverseString.reverseString(s);
        assertArrayEquals(new char[]{'r'}, s);

        s = new char[]{'c', 'o', 'm', 'u', 'n', 'i', 'c', 'a', 't', 'i', 'o', 'n'};
        reverseString.reverseString(s);
        assertArrayEquals(new char[]{'n', 'o', 'i', 't', 'a', 'c', 'i', 'n', 'u', 'm', 'o', 'c'}, s);
    }

}