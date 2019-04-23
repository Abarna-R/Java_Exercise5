package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class Studentinfo {
    public Map<String,String> exchangeKeys(Map<String,String> map)
    {
        Map<String,String> mapped = new HashMap<>();
        String[] s1= new String[map.size()];
        String[] s2= new String[map.size()];
        int i=0;
        //  result.putAll(map);
        for ( Map.Entry<String,String> entry : map.entrySet()) {
            // result.keySet().add(entry.getKey());
            s1[i]=entry.getKey();
            s2[i]=entry.getValue();
            i++;
        }

        for(int j=map.size()-1;j>=0;j--) {
            if (j==map.size()-1) {
                //entry.setValue("");
                mapped.put(s1[j],"");

            }
            else {
                mapped.put(s1[j], s2[j+1]);
            }
        }
        return mapped;
    }
}
