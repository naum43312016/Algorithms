package com.naum.recursion;

/**
 * /**
 *  * Recursive Fibonacci function
 *  * @author Naum Asafov
 */

public class Fibonacci {

    public static int fibonacciRecursive(int n){
        if (n < 2) {
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
}