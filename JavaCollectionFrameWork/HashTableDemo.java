package JavaCollectionFrameWork;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        // hash table is a data structure that stores key-value pairs in an array
        // using a hash function to calculate the index of each key
        Hashtable ht = new Hashtable();

        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");

       // String s  = (String) ht.get(3);

        //ht.compute(2, (k,v)->v+"Z");
        ht.computeIfAbsent(7, (k)->"Z"+k);
        System.out.println(ht);



        /*

        // not a generic class so there is no iterable
        // using enumerator to iterate
        //Enumeration e = ht.elements();
        Enumeration e = ht.keys();

        while (e.hasMoreElements()) {
            // shows values
            System.out.println(e.nextElement());
        }

        //System.out.println(ht);

         */
    }
}
