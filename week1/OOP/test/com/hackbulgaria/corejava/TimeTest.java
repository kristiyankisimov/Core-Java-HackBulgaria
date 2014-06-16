package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimeTest {
    
    private Time time;

    @Before
    public void setUp() throws Exception {
        time = new Time(12, 12, 12, 12, 12, 15);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testToString() {
        assertEquals("12:12:12 12.12.15", time.toString());
    }

}
