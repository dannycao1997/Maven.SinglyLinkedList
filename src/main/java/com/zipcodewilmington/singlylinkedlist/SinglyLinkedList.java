package com.zipcodewilmington.singlylinkedlist;

import javax.xml.soap.Node;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    private Node head;
    private int size;

    private class Node {
        int data;
        Node next;

        Node(int data) { // inner node class
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

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public boolean contains(int data){
        return false;
    }

    public int find(int data) {
        return -1;
    }

    public int size(){
        return size;
    }

    public int get(int index){
        return null;
    }

    public SinglyLinkedList copy(){
        return null;
    }

    public void sort(){
    }

    public void reverse(){
    }

    public SinglyLinkedList slice(int start, int end){
        return null;
    }

}
