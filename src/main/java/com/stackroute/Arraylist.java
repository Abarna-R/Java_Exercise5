package com.stackroute;

import java.util.ArrayList;

public class Arraylist {
    public ArrayList<String> add(ArrayList<String> list , String query, int index)
    {
        list.remove(index);
        list.add(index,query);
        return list;
    }
    public int remove(ArrayList<String> list)
    {
        list.clear();
        return list.size();
    }
}
