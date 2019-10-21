package com.naum.sorting;

/**
 * Selection sort algorithm
 * @author Naum Asafov
 */
public class SelectionSort {


    public static void sort(int[] arr){ //O(n^2)

        for (int i =0;i<arr.length;i++){
            int min = arr[i];
            int index = i;
            for (int j = i;j<arr.length;j++){
                if (min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
        }
    }
}
