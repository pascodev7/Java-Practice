package com.pascodev.linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;
    private  int sizeOfList;

    // Implementation of the insert method define in the List interface
    @Override
    public void insert(T data) {

        ++this.sizeOfList;

        if (root == null){
            this.root = new Node<>(data);
        }else{
            insertDataAtTheBeginning(data);
        }
    }
    // O(1) time complexity ----> Constant time complexity
    private void insertDataAtTheBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    // What if I want to insert at the end? I'm gonna implement it but i will not use it
    // O(N) time complexity ----> Linear time complexity
    private void insertAtTheEnd(T data, Node<T> node){
        if (node.getNextNode() != null){
            insertAtTheEnd(data, node.getNextNode());
        }else{
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    // Implementation of the "remove method define in the List interface
    @Override
    public void remove(T data) {

        if (this.root == null) return;

        --this.sizeOfList;

        if (this.root.getData().compareTo(data) == 0 ){
            this.root = this.root.getNextNode();
        }else{
            remove(data, root, root.getNextNode());
        }

    }

    private void remove(T dataToRemove, Node<T> previousNode, Node<T> actualNode ){

        while(actualNode != null ){
            if (actualNode.getData().compareTo(dataToRemove) == 0 ){
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }

            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    // Implementation of the "traverseList" method define in the List interface
    @Override
    public void traverseList() {

        // although I could implement it in a recursive manner I'm going to implement it in an iterative manner
        if (this.root == null) return; // Checking if the list is empty

        Node<T> actualNode = this.root; // If the list isn't empty

        while(actualNode != null){
            System.out.print(actualNode + " -> ");
            actualNode = actualNode.getNextNode(); // to update the actual node
        }

    }

    // Implementation of the "size" method define in the List interface
    @Override
    public int size() {
        return this.sizeOfList;
    }
}
