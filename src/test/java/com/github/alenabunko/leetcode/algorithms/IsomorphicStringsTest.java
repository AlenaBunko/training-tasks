package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

    @Test
    void testDifferentVariousString() {
        String firstVarious = "egg";
        String secondVarious = "add";
        assertTrue(isomorphicStrings.isIsomorphic(firstVarious, secondVarious));

        String varoius3 = "foo";
        String various4 = "for";
        assertFalse(isomorphicStrings.isIsomorphic(varoius3, various4));

        String oneSymbol = "i";
        String singleSymbol = "i";
        assertTrue(isomorphicStrings.isIsomorphic(oneSymbol, singleSymbol));
    }

}