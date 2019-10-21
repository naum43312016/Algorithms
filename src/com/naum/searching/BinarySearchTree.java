package com.naum.searching;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinarySearchTree<T extends Comparable<T>> {


    Node<T> root = null;

    private static class Node<T extends Comparable<T>>{
        T value;
        Node<T> left,right;

        Node(T value, Node<T> left, Node<T> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public void insert(T value) {
        if (root == null){
            root = createRoot(value);
        }else {
            insertToTree(value,root);
        }
    }
    private void insertToTree(T value,Node<T> node){

        if (value.compareTo(node.value) > 0){
            if (node.right==null){
                node.right = createNewNode(value);
            }else {
                insertToTree(value,node.right);
            }
        }

        if (value.compareTo(node.value) < 0){
            if (node.left==null){
                node.left = createNewNode(value);
            }else {
                insertToTree(value,node.left);
            }
        }
    }


    private Node<T> createRoot(T value){
        return new Node<>(value,null,null);

    }
    private Node<T> createNewNode(T value){
        return new Node<>(value,null,null);
    }

    public boolean search(T value) {
        return searchInTree(value,root);
    }

    private boolean searchInTree(T value,Node<T> node){
        if (node==null) return false;
        if (value.compareTo(node.value)==0){
            return true;
        }else if (value.compareTo(node.value)>0){
            return searchInTree(value,node.right);
        }else if (value.compareTo(node.value)<0){
            return searchInTree(value,node.left);
        }else {
            return false;
        }
    }

    public void traverseDFS(){
        traverseTreeDFS(root);
    }

    private void traverseTreeDFS(Node<T> node){
        //increment all values
        node.value = increment(node);
        if (node.left!=null){
            traverseTreeDFS(node.left);
        }
        if (node.right!=null){
            traverseTreeDFS(node.right);
        }
    }

    public void traverseBFS(){
        traverseTreeBFS(root);
    }

    private void traverseTreeBFS(Node<T> node){
        //increment all values

        Queue<Node<T>> queue = new LinkedList<>();

        while (node!=null){
            node.value = increment(node);
            if (node.left!=null){
                queue.add(node.left);
            }
            if (node.right!=null){
                queue.add(node.right);
            }
            node = queue.poll();
        }

    }

    private T increment(Node<T> node){
        if (node.value instanceof Integer) {
            return (T) (Integer) (((Integer)node.value) + 1);
        }
        return node.value;
    }



    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
