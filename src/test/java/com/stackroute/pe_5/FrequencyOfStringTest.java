package com.stackroute.pe_5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrequencyOfStringTest {

    FrequencyOfString FrequencyOfStr;
    @Before
    public void setUp() throws Exception {
        FrequencyOfStr  =new FrequencyOfString();
    }

    @After
    public void tearDown() throws Exception {
        FrequencyOfStr=null;
    }

    @Test
    public void checkFrequency() {
        String expected="{one=5, two=2, three=2}";
        String actual=FrequencyOfStr.checkFrequency("one one -one___two,,three,one @three*one?two");
        assertEquals(expected,actual);
    }

    @Test
    public void checkFrequencyNull() {

        String actual=FrequencyOfStr.checkFrequency(null);
        assertNull(actual);
    }
    @Test
    public void checkFrequencyNotNull() {

        String actual=FrequencyOfStr.checkFrequency("i am Batman");
        assertNotNull(actual);
    }
}
