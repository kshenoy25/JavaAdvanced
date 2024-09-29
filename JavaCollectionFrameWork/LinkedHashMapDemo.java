package JavaCollectionFrameWork;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args){
        // LinkedHashmaps have a notable advantage over Hashmaps
        // that is because they maintain an ordered list which makes iterating through elements faster
        // this method is more efficient when dealing with smaller data sets
        // null values are allowed in LinkedHashMap
        // adds awareness to the order at which items are added or accessed, so the iteration order is the same as the insertion order
        // depending on construction parameters
        // provides a great starting point for creating a Cache object by overriding the removeEldestEntry()
        // this lets you create a Cache object that can expire data using some criteria that you define


// .75f , true -> parameter of LinkedHashMap
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5) {

            // override the method using anonymous class
            // fixed cache memory
          protected boolean removeEldestEntry(Map.Entry e){
              return size() > 5;
          }

        };


        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");

        String s = lhm.get(2);
        s = lhm.get(5);
        s = lhm.get(1);

        lhm.put(6, "F");
        //lhm.put(9, "I");
        //lhm.put(8, "H");

        lhm.forEach((k,v)->System.out.println(k+" "+v));

    }
}
