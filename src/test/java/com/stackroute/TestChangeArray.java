package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class TestChangeArray {

    private static ChangeArray updateArray;

    @BeforeClass
    public static void setUp()
    {
        updateArray = new ChangeArray();
    }
    @AfterClass
    public static void tearDown()
    {
        updateArray=null;
    }
    @Test
    public void testUpdateArray()
    {
        assertEquals("replaceArray() returned incorrect values",
                new String[]{"Kiwi","Grape","Melon","Berry"}
                ,updateArray.replace(new String[]{"Apple","Grape","Melon","Berry"}, "Kiwi",0));
        assertEquals("replaceArray() returned incorrect values",
                new String[]{"abc","jas","fgh",}
                ,updateArray.replace(new String[]{"abc","cde","fgh"}, "jas",1));
    }
    @Test
    public void testUpdateArrayFailure()
    {
        assertNotNull("replaceArray() returned incorrect values",
                updateArray.replace(new String[]{"Apple","Grape","Melon","Berry"}, "Kiwi",0));
    }
    @Test
    public void testEmptyArray()
    {
        assertEquals("emptyArray() returned incorrect values",
                0,
                updateArray.empty(new String[]{"Apple","Grape","Melon","Berry"}));
        assertEquals("emptyArray() returned incorrect values",
                0,
                updateArray.empty(new String[]{"abc","dasfsd","xyz"}));
    }
    @Test
    public void testEmptyArrayFailure()
    {
        assertNotNull("emptyArray() returned incorrect values",
                updateArray.replace(new String[]{"Apple","Grape","Melon","Berry"}, "Kiwi",0));

    }

}
