package com.stackroute.pe_5;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapElementTest {
    MapElement mapElement;
    @Before
    public void setUp()  {
        mapElement=new MapElement();
    }

    @After
    public void tearDown()  {
        mapElement=null;
    }

    @Test
    public void GivenValueShouldReplaceTheValue2IntoValue1() {
        String expexted="{val2=java, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");
        String actual=mapElement.KeyValue(map);
        assertEquals(expexted,actual);
    }

    @Test
    public void GivenkeyValueShouldReturnEmptyVal1() {
        String expected="{val2=mars, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1","mars");
        map.put("val2","saturn");
        String actual=mapElement.KeyValue(map);
        assertEquals(expected,actual);
    }

    @Test
    public void GivenValueShouldReturnNull() {

        String actual=mapElement.KeyValue(null);
        assertNull(actual);
    }
}