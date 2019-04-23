package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestStringCount {

    private static StringCount countString;
    @BeforeClass
    public static void setUp()
    {
        countString = new StringCount();
    }
    @AfterClass
    public static void tearDown()
    {
        countString = null;
    }

    @Test
    public void testCountOccurences()
    {
        Map<String,Integer> map = new HashMap<>();
        map.put("one",5);map.put("two",2);map.put("three",2);
        assertEquals("calculateOccurance() returned incorrect values",
                map, countString.counting(
                        "one one -one___two,,three,one @three*one?two",
                        new String[]{"one","two","three"}));
    }
    @Test
    public void testCountOccurencesFailure()
    {
        Map<String,Integer> map = new HashMap<>();
        map.put("one",5);map.put("two",2);map.put("three",2);
        assertNotNull("calculateOccurance() returned incorrect values",
                countString.counting(
                        "one one -one___two,,three,one @three*one?two",
                        new String[]{"one","two","three"}));
    }
}
