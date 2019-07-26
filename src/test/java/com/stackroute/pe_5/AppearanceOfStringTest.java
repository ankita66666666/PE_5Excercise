package com.stackroute.pe_5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppearanceOfStringTest {


    AppearanceOfString appearance;
    @Before
    public void setUp()  {
        appearance=new AppearanceOfString();
    }

    @After
    public void tearDown()  {
        appearance=null;
    }

    @Test
    public void givenStringShouldCheckAppearance() {
        String expected="{a : true, b : false, c : true, d : false}";
        String arr[] = {"a","b","c","d","a","c","c"};
        String actual=appearance.checkAppearance(String.join(" ",arr)).replaceAll("="," : ");
        assertEquals(expected,actual);
    }

    @Test
    public void givenStringShouldCheckAppearanceNull() {

        String actual=appearance.checkAppearance(null);
        assertNull(actual);

    }

}