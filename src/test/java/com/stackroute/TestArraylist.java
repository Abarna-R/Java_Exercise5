package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestArraylist {

    private static Arraylist arrayListUpdate;
    @BeforeClass
    public static void setUp()
    {
        arrayListUpdate = new Arraylist();
    }
    @AfterClass
    public static void tearDown()
    {
        arrayListUpdate=null;
    }
    @Test
    public void testUpdateArrayList()
    {
        ArrayList<String> original = new ArrayList<>();
        original.add("Apple");original.add("Melon");
        original.add("Grape");original.add("Berry");

        ArrayList<String> newList = new ArrayList<>();
        newList.add("Kiwi");newList.add("Melon");
        newList.add("Grape");newList.add("Berry");
        assertEquals("updateArrayList() returned incorrect values",
                newList,
                arrayListUpdate.add(original,"Kiwi",0));
    }
    @Test
    public void testUpdateArrayListFailure()
    {
        ArrayList<String> original = new ArrayList<>();
        original.add("Apple");original.add("Melon");
        original.add("Grape");original.add("Berry");

        ArrayList<String> newList = new ArrayList<>();
        newList.add("Kiwi");newList.add("Melon");
        newList.add("Grape");newList.add("Berry");
        assertNotNull("updateArrayList() returned incorrect values",
                arrayListUpdate.add(original,"Kiwi",0));
    }
    @Test
    public void testRemoveArrayList()
    {
        ArrayList<String> original = new ArrayList<>();
        original.add("Apple");original.add("Melon");
        original.add("Grape");original.add("Berry");

        assertEquals("removeArrayList() returned incorrect values",
                0,
                arrayListUpdate.remove(original));
    }
    @Test
    public void testRemoveArrayListFailure()
    {
        ArrayList<String> original = new ArrayList<>();
        original.add("Apple");original.add("Melon");
        original.add("Grape");original.add("Berry");

        assertNotNull("removeArrayList() returned incorrect values",
                arrayListUpdate.remove(original));
    }

}
