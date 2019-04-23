package com.stackroute;

import java.util.ArrayList;

public class ChangeArray {

    public String[] replace(String[] s1, String s2,int index)
    {
        String[] s3 = new String[s1.length];
        for (int i=0;i<s3.length;i++)
        {
            if(i==index)
            {
                s3[i] = s2;
            }
            else
                s3[i]=s1[i];
        }
        return s3;
    }
    public int empty(String[] string)
    {
        ArrayList<String> StringArray = new ArrayList<>();
        for(int i=0;i<string.length;i++)
        {
            StringArray.add(string[i]);
        }
        StringArray.clear();
        return StringArray.size();
    }

}
