package com.pascodev.linkedlist;

public class LinkedListDemo {

    public static void main(String[] args) {
        System.out.println("We are gonna deal with linked list...");

        // List<Integer> list = new LinkedList<Integer>();
        // List<String> list = new LinkedList<String>();
        List<Person> list = new LinkedList<Person>();

        Person p = new Person("Cristiano", 35);

        list.insert(p);
        list.insert(new Person("Messi", 33));
        list.insert(new Person("Neymar", 28));
        

        list.remove(p);

       // list.insert("Adam");
       // list.insert(18);
       // list.insert(-20);
       // list.insert(25);
        // list.insert("Eve");
      //  list.insert(35);
     //   list.insert(21);
     //   list.insert(3);

        System.out.println("The list contains " + list.size() + " item(s)");

        /*
        list.remove(3);  // removing the first item
        list.remove(18); // Removing the last item
        list.remove(35); // Removing some internal node
         */
        list.traverseList();


    }
}
