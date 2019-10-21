package com.naum.searching;

public class LinearSearch {

    public static boolean search(int[] arr,int key){

        for (int i : arr){
            if (i==key){
                return true;
            }
        }
        return false;
    }
}
