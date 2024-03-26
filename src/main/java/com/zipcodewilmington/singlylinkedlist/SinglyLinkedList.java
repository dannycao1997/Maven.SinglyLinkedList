package com.zipcodewilmington.singlylinkedlist;

// need to come back to review and practice more 99.99% finished
/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    private Node head;
    private int size;

    private class Node { // inner node class
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public SinglyLinkedList() { // constructor
        head = null;
        size = 0;
    }

    public void add(int data) { //add element to list method
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void remove(int index) { // remove element from list method
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head =head.next;
        } else {
            Node current = head;
            for (int i = 0; i <index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public boolean contains(int data){ // check if element is in list method
        Node current = head;
        while(current != null){
            if(current.data ==data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int find(int data) { // find index of element method
        Node current = head;
        int index =0;
        while (current != null) {
            if(current.data == data) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public int size(){ // get size of list method
        return size;
    }

    public int get(int index){ // get element at specific index method
        if(index <0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for(int i = 0; i <index; i++){
            current = current.next;
        }
        return current.data;
    }

    public SinglyLinkedList copy(){ // make copy of lisst method
        SinglyLinkedList newNodeList = new SinglyLinkedList();
        Node current = head;
        while(current != null){
            newNodeList.add(current.data);
            current= current.next;
        }
        return newNodeList;
    }

    public void sort(){ // BRUH longest bubble sort method in the world
        if (size <= 1){ // if list has 0 or 1 elements, it's already sorted
            return;
        }
        boolean swapped;
        Node end = null; // tracks end of the sorted position of the list

        do{
            swapped = false; // reset swapped flag for each pass
            Node current = head;
            Node previous = null;

            while(current.next != end ){ // iterate through the list
                Node nextNode = current.next;

                if(current.data > nextNode.data) { // compare adjacent elements and swaps if needed

                    int temp = current.data; //swap data
                    current.data = nextNode.data;
                    nextNode.data = temp;
                    swapped = true; // set swapped flag to true if any swaps happened
                }
                previous = current; // moves to next node
                current = current.next;
            }
            end = current; // after each pass, the largest element is in the correct place
        } while(swapped); // continue until no more swaps are made in the pass
    }



    public void reverse(){
        if (size <= 1) { // if list has 0 or 1 elements, its already reverseeed
            return;
        }
        Node prev = null;
        Node current = head;
        Node nextNode;

        while(current != null) {
            nextNode = current.next; // save the next node
            current.next = prev; // reverse the pointer
            prev = current; // moves pointers one poisiton ahead
            current = nextNode;
        }
        head = prev; // update head to point to the first new node
    }

    public SinglyLinkedList splice(int start, int end){
        if (start > 0 || start >= size || end <= start || end > size) {
            throw new IllegalArgumentException("Invalid start and end indices");
        }
        SinglyLinkedList newList = new SinglyLinkedList();
        Node current = head;

        for (int i = 0; i < start; i ++){ // moves current to the starting index
            current = current.next;
        }
        for (int i = start ; i < end; i++){ // add elements to new list until it reaches end of index
            newList.add(current.data);
            current = current.next;
        }
        return newList;
    }
}
