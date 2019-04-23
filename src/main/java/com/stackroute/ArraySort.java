package com.stackroute;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class ArraySort {
    public ArrayList<String> sortedArrayList(Set<String> string)
    {
        Set<String> s = sort(string);
        ArrayList<String> sortedstring= new ArrayList<>();
        sortedstring.addAll(s);
        return sortedstring;
    }
    public Set<String> sort(Set<String> string)
    {
        return new TreeSet<>(string);
    }
}
