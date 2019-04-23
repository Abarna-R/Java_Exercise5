package com.stackroute;

import java.util.*;
import java.util.regex.*;

public class StringCount {

    public Map<String,Integer> counting(String s1, String[] s2)
    {
        Map<String,Integer> output = new HashMap<>();
        int count;
        for(int i=0;i<s2.length;i++)
        {
            count=0;
            Pattern p = Pattern.compile(s2[i]);
            Matcher m = p.matcher(s1);
            while (m.find()){
                count +=1;
            }
            output.put(s2[i],count);
        }
        return output;
    }
}
