package JavaCollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args){
        //LinkedHashSet<String> lhs = new LinkedHashSet<>(10);
        // using HashSet orders the following
        HashSet<String> lhs = new HashSet<>(10);


        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");
        // cannot add the same String value in
        //lhs.add("B");

        Iterator<String> itr = lhs.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //lhs.forEach(System.out::println);

    }
}
