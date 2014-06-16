package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PairTest {
    
    private Pair pair;

    @Before
    public void setUp() throws Exception {
        pair = new Pair(2, 1);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetFirst() {
        assertEquals(2,  pair.getFirst());
        assertEquals("Kris", (new Pair("Kris", 20).getFirst()));
    }

    @Test
    public void testGetSecond() {
        assertEquals(1,  pair.getSecond());
        assertEquals("Kris", (new Pair("Evil", "Kris").getSecond()));
    }

    @Test
    public void testToString() {
        assertEquals("(2, 1)", pair.toString());
        assertEquals("(Kris, is stupid)", (new Pair("Kris", "is stupid").toString()));
    }

    @Test
    public void testEqualsPair() {
        assertTrue(pair.equals(new Pair(2, 1)));
        assertFalse(pair.equals(new Pair("2", 1)));
    }

}
