package com.stackroute;

import java.util.*;
import java.util.regex.*;

public class StringBoolean {
    public Map<String,Boolean> Boolean(String s1, String[] s2)
    {
        Map<String,Boolean> checked = new HashMap<>();
        int count;
        for(int i=0;i<s2.length;i++)
        {
            count=0;
            Pattern p = Pattern.compile(s2[i]);
            Matcher m = p.matcher(s1);
            while (m.find()){
                count +=1;
            }
            if(count>0)
                checked.put(s2[i],true);
            else
                checked.put(s2[i],false);

        }
        return checked;
    }
}

