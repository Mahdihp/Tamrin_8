package part_2;

import java.util.*;

public class TestClass {
    public static void main(String[] args) {



    }

    private static void swaped(Map<String,String> map) {
        Set<String> keys = map.keySet();
        Collection<String> values = map.values();
        map.clear();


        HashMap<String,String> newMap = new HashMap();

        for(Map.Entry<String,String> entry : map.entrySet())
            newMap.put(entry.getValue(), entry.getKey());

        map.putAll(newMap);
    }


}
