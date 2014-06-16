package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackImplTest {
    
    private Stack<Integer> stack;

    @Before
    public void setUp() throws Exception {
        stack = new StackImpl<>();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPush() {
        stack.push(1);
        assertEquals("[1]", stack.toString());
        stack.push(78);
        assertEquals(2, stack.size());
    }

    @Test
    public void testPop() {
        stack.push(1);
        assertEquals("[1]", stack.toString());
        assertEquals((Integer) 1, stack.pop());
        assertEquals(0, stack.size());
    }

    @Test
    public void testPeek() {
        stack.push(7);
        assertEquals((Integer) 7, stack.peek());
        stack.push(8);
        assertEquals((Integer) 8, stack.peek());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(7);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testClear() {
        assertEquals(0, stack.size());
        stack.push(4);
        stack.clear();
        assertEquals(0, stack.size());
        assertEquals("[]", stack.toString());
    }

    @Test
    public void testSize() {
        assertEquals(0, stack.size());
        stack.push(7);
        assertEquals(1, stack.size());
    }

    @Test
    public void testToString() {
        assertEquals("[]", stack.toString());
        stack.push(1);
        assertEquals("[1]", stack.toString());
        stack.push(2);
        assertEquals("[1, 2]", stack.toString());
    }

}
