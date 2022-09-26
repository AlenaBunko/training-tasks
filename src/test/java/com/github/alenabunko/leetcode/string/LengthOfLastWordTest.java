package com.github.alenabunko.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    LengthOfLastWord length = new LengthOfLastWord();

    @Test
    void testDifferentCombinationOfElements() {
        assertEquals(4, length.lengthOfLastWord("   fly me   to   the moon   "));
        assertEquals(5, length.lengthOfLastWord("Hello World"));
        assertEquals(6, length.lengthOfLastWord("luffy is still joyboy"));
        assertEquals(8, length.lengthOfLastWord(" expected                          "));
    }

}