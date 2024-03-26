package com.zipcodewilmington.singlylinkedlist;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// need to come back and redo tests
/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    private SinglyLinkedList list;


    @Before
    public void setup() {
        list = new SinglyLinkedList();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(4, list.size());
        list.add(10);
        Assert.assertEquals(5, list.size());
        Assert.assertEquals(10, list.get(4));
    }

    @Test
    public void testRemove() {
        list.remove(2);
        Assert.assertEquals(3, list.size());
        Assert.assertFalse(list.contains(8));
        Assert.assertEquals(1, list.get(2));
    }

    @Test
    public void testContains() {
        Assert.assertTrue(list.contains(3));
        Assert.assertFalse(list.contains(7));
    }


    @Test
    public void testFind() {
        Assert.assertEquals(2, list.find(8));
        Assert.assertEquals(-1, list.find(7));
    }

    @Test
    public void testSize() {
        Assert.assertEquals(4, list.size());
    }

    @Test
    public void testGet() {
        Assert.assertEquals(3, list.get(1));
    }

    @Test
    public void testCopy() {
        SinglyLinkedList copyList = list.copy();
        Assert.assertEquals(list.size(), copyList.size());
        Assert.assertEquals(list.get(2), copyList.get(2));
    }

    @Test
    public void testSort() {
        list.sort();
        Assert.assertEquals(1, list.get(0));
        Assert.assertEquals(5, list.get(2));
    }

    @Test
    public void testReverse() {
        list.reverse();
        Assert.assertEquals(1, list.get(0));
        Assert.assertEquals(8, list.get(1));
        Assert.assertEquals(3, list.get(2));
        Assert.assertEquals(5, list.get(3));
    }

    @Test
    public void testSplice() { // need to come back and figure out testSplice tests
    }

}