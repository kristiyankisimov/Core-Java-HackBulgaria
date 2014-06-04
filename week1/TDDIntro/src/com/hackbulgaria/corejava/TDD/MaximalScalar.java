package com.hackbulgaria.corejava.TDD;

import java.util.Arrays;

public class MaximalScalar {
    public long maximalScalar(int[] a, int[] b) {
        long result = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }
        return result;
    }
}
