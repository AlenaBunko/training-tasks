package com.github.alenabunko.leetcode.algorithms;

public class ReverseInteger {

    public int reverse(int x) {
        String result = "";
        int sign = 1;

        if (x < 0) {
            sign = -1;
        }

        if (x == Integer.MIN_VALUE) {
            return 0;
        }

        int abs = Math.abs(x);

        if (abs < 10) {
            return abs * sign;
        }

        while (abs != 0) {
            result += (abs % 10);
            abs = abs / 10;
        }

        if (result.length() == 10) {
            int comparedValue = returnPartReverse(result);
            if ((comparedValue < 0 && comparedValue > Integer.MIN_VALUE/10) || (comparedValue > Integer.MAX_VALUE / 10)) {
                return 0;
            }
        }

        return Integer.parseInt(result) * sign;
    }

    static int returnPartReverse(String result) {
        String tempResult = result.substring(0, result.length() - 1);
        return Integer.parseInt(tempResult);
    }
}
