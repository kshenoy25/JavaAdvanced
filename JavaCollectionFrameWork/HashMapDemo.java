package JavaCollectionFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.*;

public class HashMapDemo {
    // stored in key value pair
    // not a sorted map
    public static void main(String[] args) {
        HashMap<Integer, String> treeMap = new HashMap<>(Map.of(0, "A",1, "B", 2, "C", 3, "D", 4, "E", 5, "F"));

        treeMap.put(6,"G");
        treeMap.put(7,"H");

        //Entry<Integer, String> e = treeMap.firstEntry();
        //System.out.println(treeMap.ceilingEntry(6).getKey());
        //System.out.println(e.getKey()+" "+e.getValue());

        System.out.println(treeMap);
    }
}
