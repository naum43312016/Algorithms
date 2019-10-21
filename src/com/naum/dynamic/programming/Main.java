package com.naum.dynamic.programming;

public class Main {
    public static void main(String[] args) {

        long preTime=System.currentTimeMillis();
        System.out.println(Fibonacci.fibonacciRecursive(50));
        long postTime=System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds->"+(postTime-preTime));
    }
}
