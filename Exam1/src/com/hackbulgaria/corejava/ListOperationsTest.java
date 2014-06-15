package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListOperationsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSortWithElements() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5, -8, 5, 12, 8, 77));
        assertEquals(Arrays.asList(-8, 5, 5, 8, 12, 77), ListOperations.sort(list1));

        list1.add(5);
        assertEquals(Arrays.asList(-8, 5, 5, 5, 8, 12, 77), ListOperations.sort(list1));

        list1.add(-5);
        assertEquals(Arrays.asList(-8, -5, 5, 5, 5, 8, 12, 77), ListOperations.sort(list1));
    }

    @Test
    public void testSortWithNoElements() {
        List<Integer> list = new ArrayList<>();
        assertEquals(Arrays.asList(), ListOperations.sort(list));
    }

    @Test
    public void testReverse() {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, -8, 5, 12, 8, 77));
        assertEquals(Arrays.asList(77, 8, 12, 5, -8, 5), ListOperations.reverse(list));

        list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), ListOperations.reverse(list));
    }

    @Test
    public void testReverseWithNoElements() {
        List<Integer> list = new ArrayList<>();
        assertEquals(Arrays.asList(), ListOperations.sort(list));
    }

    @Test
    public void testIsMonotonous() {
        assertTrue(ListOperations.isMonotonous(Arrays.asList(1, 2, 3, 4, 5, 6)));
        assertTrue(ListOperations.isMonotonous(Arrays.asList(6, 5, 4, 3, 2, 1, 1, 1)));
        assertFalse(ListOperations.isMonotonous(Arrays.asList(1, 2, 1, 4, 5, 4)));
        assertTrue(ListOperations.isMonotonous(Arrays.asList(1)));
    }
}
