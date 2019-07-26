package com.stackroute.pe_5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListDemoTest {

    ArrayListDemo arrayListDemo;

    @Before
    public void setUp() throws Exception {
        arrayListDemo = new ArrayListDemo();
    }

    @After
    public void tearDown() throws Exception {
        arrayListDemo = null;
    }

    @Test
    public void addArray() {
        String expexted = "[Kiwi, Grape, Mango, Berry]";
        String actual = arrayListDemo.addArray("Kiwi Grape Mango Berry".split(" ")).toString();
        assertEquals(expexted, actual);
    }

    @Test
    public void removeAll() {
        String expexted = "[]";
        arrayListDemo.addArray("Kiwi Grape Mango Berry".split(" "));
        String actual = arrayListDemo.removeAll().toString();
        assertEquals(expexted, actual);
    }

    @Test
    public void update() {
        String expexted = "[Kiwi, Grape, Mango, Berry]";
        arrayListDemo.addArray("Apple Grape Melon Berry".split(" "));
        arrayListDemo.update(0, "Kiwi");

        String actual = arrayListDemo.update(2, "Mango").toString();
        assertEquals(expexted, actual);
    }
}