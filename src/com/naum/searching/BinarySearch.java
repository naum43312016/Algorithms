package com.naum.searching;


/**
 * Binary search algorithm
 * sorted array
 * @author Naum Asafov
 */

//{5,4,8,1,12,3};
    //1,3,4,5,8,12
public class BinarySearch {

    public static boolean search(int[] arr,int key){
        return binarySearch(arr,0,arr.length-1,key);
    }

    private static boolean binarySearch(int[] arr,int left,int right,int key){
        int mid = (left + right) >>> 1;

        if (arr[mid] == key){
            return true;
        }else if (left>=right){
            return false;
        }
        if (key>arr[mid]){
            return binarySearch(arr,mid+1,right,key);
        }else {
            return binarySearch(arr,left,mid-1,key);
        }
    }
}
