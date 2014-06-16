package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BMWTest {
    
    private BMW bmw;

    @Before
    public void setUp() throws Exception {
        bmw = new BMW();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testToString() {
        assertEquals(String.format("BMW@%d", bmw.hashCode()), bmw.toString());
    }

}
