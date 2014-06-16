package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AudiTest {
    
    private Audi audi;
    
    @Before
    public void setUp() throws Exception {
        audi = new Audi();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testToString() {
        assertEquals(String.format("Audi@%d", audi.hashCode()), audi.toString());
    }

}
