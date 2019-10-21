package com.naum.sorting;


public class QuickSort {

    public static void sort(int[] arr){
        quickSort(arr,0,arr.length-1);

    }

    private static void quickSort(int[] arr,int left, int right){
        int pivot = arr[right];
        int i = right;
        int j = left;
        while (left < right){
            while (arr[j] < pivot){
                j++;
            }
            if (arr[j] > pivot){
                swap(arr,j,i);
                i--;
                swap(arr,j,i);
            }
            left++;


        }

        if (j>0) {
            quickSort(arr, 0, j - 1);
        }
        if (j<right) {
            quickSort(arr, j + 1, right);
        }
    }
    private static void swap(int[] arr,int left,int pivot){
        int temp = arr[pivot];
        arr[pivot] = arr[left];
        arr[left] = temp;
    }
}
