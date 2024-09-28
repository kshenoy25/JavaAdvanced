package JavaCollectionFrameWork;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    // hierarchy of TreeSet
    // Set <-- (extends) SortedSet <-- (extends) NavigableSet <-- (implements) TreeSet

    public static void main(String[] args){
        //TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40));
        Collection<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40));

        //ts.add(25);
        //System.out.println(ts.ceiling(55));


        System.out.println(ts);
    }
}
