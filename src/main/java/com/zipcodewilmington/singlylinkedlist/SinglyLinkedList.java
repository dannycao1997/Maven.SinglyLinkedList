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

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public SinglyLinkedList(){
        head = null;
        size = 0;
    }

    public void add(int data){ //add method
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

    public boolean remove(int index){
        return false;
    }

    public boolean contains(E element){
        return false;
    }

    public int find(E element) {
        return -1;
    }

    public int size(){
        return size;
    }

    public E get(int index){
        return null;
    }

    public SinglyLinkedList<E> copy(){
        return null;
    }

    public void sort(){
    }

    public void reverse(){
    }

    public SinglyLinkedList<E> slice(int start, int end){
        return null;
    }

}
