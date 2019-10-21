package com.naum.searching;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*int[] arr = {5,4,8,1,12,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(BinarySearch.search(arr,8));*/


        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        tree.insert(25);
        tree.insert(60);
        tree.insert(55);
        tree.insert(12);
        tree.insert(16);
        tree.insert(18);

        tree.traverseBFS();
        System.out.println(tree);
    }
}
