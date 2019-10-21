package com.naum.sorting;


/**
 * Simple bubble sort algorithm
 * @author Naum Asafov
 */
public class BubbleSort {

    public static void sort(int[] arr){ //O(n^2)
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void reverseSort(int[] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length-1;j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}