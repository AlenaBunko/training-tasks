package com.github.alenabunko.leetcode.algorithms;

public class VersionControl {
    private final int n;
    private final int badVersion;

    public VersionControl(int n, int badVersion) {
        this.n = n;
        this.badVersion = badVersion;
    }

    boolean isBadVersion(int version) {
        return version >= badVersion;
    }

    public int getBadVersion() {
        return badVersion;
    }

    public int getN() {
        return n;
    }
}
