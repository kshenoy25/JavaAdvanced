package JavaCollectionFrameWork;

import java.util.HashSet;

public class HashSetDemo {

    public static void  main(String[] args) {
        // HashTable output may not be in the same order
        // can have a fixed percent loading factor
        // by default loading factor is .75 so 25% is wasted space
        // add/remove statements if need be in constant time use HashSet
        HashSet<Integer> hs = new HashSet<>(20,0.25f);

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);

        System.out.println(hs);
    }
}
