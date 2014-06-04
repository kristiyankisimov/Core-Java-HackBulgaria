package com.hackbulgaria.corejava.TDD;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestProblems {

    private Problems problems;

    @Before
    public void setUp() throws Exception {
        problems = new Problems();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetNumberOfDigits() {
        assertEquals(1, problems.getNumberOfDigits(0));
        assertEquals(5, problems.getNumberOfDigits(15444));
    }

    @Test
    public void testJoin() {
        Object[] obj = { "Kris", "is", 20, "years", "old!" };
        assertEquals("Kris is 20 years old!", problems.join(" ", obj));
    }

    @Test
    public void testReduceFilePath() {
        assertEquals("/", problems.reduceFilePath("/"));
        assertEquals("/", problems.reduceFilePath("/srv/../"));
        assertEquals("/srv/www/htdocs/wtf", problems.reduceFilePath("/srv/www/htdocs/wtf/"));
        assertEquals("/srv/www/htdocs/wtf", problems.reduceFilePath("/srv/www/htdocs/wtf"));
        assertEquals("/srv", problems.reduceFilePath("/srv/./././././"));
        assertEquals("/etc/wtf", problems.reduceFilePath("/etc//wtf/"));
        assertEquals("/", problems.reduceFilePath("/etc/../etc/../etc/../"));
        assertEquals("/", problems.reduceFilePath("//////////////"));
        assertEquals("/", problems.reduceFilePath("/../"));
    }

}