package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    @Test
    void testDifferentValuesOfVersion() {
        FirstBadVersion versionControl = new FirstBadVersion(1000, 4);
        int n = versionControl.getN();

        assertEquals(versionControl.getBadVersion(), versionControl.firstBadVersion(n));
    }

    @Test
    void testFirstVersionIsBad() {
        FirstBadVersion version = new FirstBadVersion(255, 1);
        int n = version.getN();

        assertEquals(version.getBadVersion(), version.firstBadVersion(n));
    }

    @Test
    void testLatestVersionIsBad() {
        FirstBadVersion version = new FirstBadVersion(255, 255);
        int n = version.getN();

        assertEquals(version.getBadVersion(), version.firstBadVersion(n));
    }
}