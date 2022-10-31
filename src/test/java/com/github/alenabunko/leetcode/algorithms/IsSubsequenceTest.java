package com.github.alenabunko.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {
    IsSubsequence isSubsequence = new IsSubsequence();

    @Test
    void testDifferentVariantsOfStrings() {
        assertTrue(isSubsequence.isSubsequence("abc", "ahbgdc"));
        assertTrue(isSubsequence.isSubsequence("ace", "abcde"));
        assertTrue(isSubsequence.isSubsequence("", "acd"));
        assertFalse(isSubsequence.isSubsequence("axc", "ahbgdc"));
        assertFalse(isSubsequence.isSubsequence("acb", "ahbgdc"));
        assertFalse(isSubsequence.isSubsequence("acb", ""));
        assertFalse(isSubsequence.isSubsequence("b", "c"));
        assertFalse(isSubsequence.isSubsequence("rjufvjafbxnbgriwgokdgqdqewn", "mjmqqjrmzkvhxlyruonekhhofpzzslupzojfuoztvzmmqvmlhgqxehojfowtrinbatjujaxekbcydldglkbxsqbbnrkhfdnpfbuaktupfftiljwpgglkjqunvithzlzpgikixqeuimmtbiskemplcvljqgvlzvnqxgedxqnznddkiujwhdefziydtquoudzxstpjjitmiimbjfgfjikkjycwgnpdxpeppsturjwkgnifinccvqzwlbmgpdaodzptyrjjkbqmgdrftfbwgimsmjpknuqtijrsnwvtytqqvookinzmkkkrkgwafohflvuedssukjgipgmypakhlckvizmqvycvbxhlljzejcaijqnfgobuhuiahtmxfzoplmmjfxtggwwxliplntkfuxjcnzcqsaagahbbneugiocexcfpszzomumfqpaiydssmihdoewahoswhlnpctjmkyufsvjlrflfiktndubnymenlmpyrhjxfdcq"));
    }

}