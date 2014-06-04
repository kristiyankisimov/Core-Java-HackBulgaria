package com.hackbulgaria.corejava.TDD;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMaxScalar {

    private MaximalScalar ms;

    @Before
    public void setUp() throws Exception {
        this.ms = new MaximalScalar();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMaximalScalar() {
        int[] a = { 1 };
        int[] b = { 1 };
        assertEquals(1, ms.maximalScalar(a, b));
    }

    @Test
    public void testMaximalScalarWithZeros() {
        int[] a = { 1, 0 };
        int[] b = { 0, 1 };
        assertEquals(1, ms.maximalScalar(a, b));
    }

}
