package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListImplTest {

    LinkedList list;

    @Before
    public void setUp() throws Exception {
        list = new LinkedListImpl();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAddAt() {
        list.addAt(0, 5);
        assertEquals(1, list.getSize());
        list.addAt(1, 4);
        assertEquals(2, list.getSize());
        list.addAt(1, 45);
        assertEquals("[5, 45, 4]", list.toString());
    }

    @Test
    public void testRemoveAt() {
        assertEquals(0, list.getSize());
        list.addAt(0, 1);
        list.addAt(0, 4);
        list.addAt(0, 7);
        assertEquals(4, list.removeAt(1));
        assertEquals("[7, 1]", list.toString());
        list.addAt(1, 4);
        assertEquals(7, list.removeAt(0));
        assertEquals(1, list.removeAt(1));
    }

    @Test
    public void testRemoveHead() {
        list.addToHead(1);
        list.addToHead(5);
        assertEquals(5, list.removeHead());
        assertEquals(1, list.removeHead());
        assertTrue(list.isEmpty());
    }

    @Test
    public void testRemoveTail() {
        list.addToHead(1);
        list.addToHead(5);
        assertEquals(1, list.removeTail());
        assertEquals(5, list.removeTail());
        assertTrue(list.isEmpty());
    }

    @Test
    public void testGetSize() {
        assertEquals(0, list.getSize());
        list.addToHead(2);
        assertEquals(1, list.getSize());
        list.addToTail(8);
        assertEquals(2, list.getSize());
    }

    @Test
    public void testGetAt() {
        list.addToHead(1);
        list.addToHead(5);
        list.addAt(0, 8);
        list.addToTail(12);

        assertEquals(1, list.getAt(2));
        assertEquals(8, list.getAt(0));
        assertEquals(12, list.getAt(3));
    }

    @Test
    public void testGetHead() {
        list.addToHead(1);
        list.addToHead(5);

        assertEquals(5, list.getHead());
    }

    @Test
    public void testGetTail() {
        list.addToHead(1);
        list.addToHead(5);
        list.addToTail(8);

        assertEquals(8, list.getTail());
    }

    @Test
    public void testAddToHead() {
        list.addToHead(7);
        assertEquals(7, list.getHead());
        list.addToHead(8);
        assertEquals(8, list.getHead());
    }

    @Test
    public void testAddToTail() {
        list.addToTail(8);
        assertEquals(8, list.getTail());
        list.addToTail(89);
        assertEquals(8, list.getHead());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.addAt(0, 8);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testToString() {
        assertEquals("[]", list.toString());
        list.addToHead(1);
        assertEquals("[1]", list.toString());
        list.addToTail(5);
        assertEquals("[1, 5]", list.toString());
    }

}
