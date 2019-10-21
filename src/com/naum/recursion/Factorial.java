package com.naum.recursion;

/**
 * Recursive and Iterative Factorial function
 * @author Naum Asafov
 */

public class Factorial {

    public static int findFactorialRecursive(int num){
        if (num == 1){
            return num;
        }

        return num * findFactorialRecursive(num - 1);
    }

    public static int findFactorialIterative(int num){
        int factorial = 1;
        for (int i = 2;i<=num;i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
