package com.pascodev.collections;

import java.util.List;


public class ArrayList {

/*
*   This is one of the implementation of the list interface !!!
*       an array stores the values in the background
*
*       int[] array = new int[10];
*
*   - random access / very fast O(1)  --> random access: accessing items by the index -list.get(0)
*
*   - it is equivalent to Vector but arrayList is not synchronized
*
*   - all operations run in O(N) time approximately
*
*   - but if we want to remove items, this operation is not so efficient
*           We have to shift each item in our list - O(N)
*
*   If our application is just about adding elements to a list and
*      getting elements with unknown indexes -> an arrayList is perfect
*
*   CAPACITY: it is a parameter we can define when we intantiate an Arraylist
*         it is the initial size of the array
*            - if we know that we will store 5 million items in a list we should use it
*                 list = new ArrayList(5000000) WHY? This may reduce the amount of incremental reallocation
*
*   - if we have to remove item in other position than the last index  we better implement LinkedList
*
 */

    public static void main(String[] args) {

        // List<String> list = new ArrayList<>();

         List<String> list = new java.util.ArrayList<>(10);  // Or we can do so to auto-import the java.util.List package

        list.add("Adam");
        list.add("Joe");
        list.add("Kevin");

        // list.remove(0); // to remove an item
       // System.out.println(list.get(1)); // Access an item when we know its index

        if(list.isEmpty() == true){
            System.out.println("The list is empty, so it contains " + list.size() + " items"); // Verify if the list is empty or not
        }else{
            System.out.println("The list is not empty and contains " + list.size() + " items"); // Print the size of the list
        }

        for(String s: list){
            System.out.println(s);
        }

        // Converts the arrayList into a 1-dimensional array
        Object[] array = list.toArray();
        System.out.println();
        for(Object s: array){
            System.out.println(s);
        }
    }
}
