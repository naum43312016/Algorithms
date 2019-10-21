package com.naum.dynamic.programming;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static long[] arr = new long[51];
    public static long fibonacciRecursive(long n){
        long val = 0;
        if (n < 2) {
            return n;
        }
        if (arr[(int)n] != 0){
            return arr[(int)n];
        }else {
            val = fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
            arr[(int)n] = val;
            return val;
        }
    }
}
