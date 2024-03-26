package com.zipcodewilmington.singlylinkedlist;

import javax.xml.soap.Node;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<E> {
    private Node head;
    private int size;

    private class Node {
        E data;
        Node next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public SinglyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    public void add(E element){
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
