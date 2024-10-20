package JavaSetAndHashSet;

import com.sun.source.tree.Tree;

import java.util.*;

public class SetAndHashSet {
    // set is available in javas collection framework
    // set is one way to group like objects together and handle as one unit



    public static void main(String[] args) {

        // create a set of strings
        // set is an interface - cannot create instances of interfaces
        // set is abstract
        //Set<String> names = new HashSet<>();
        //Set<String> names = new TreeSet<>();

        // use LinkedHashSet for ordering purposes
        Set<String> names = new LinkedHashSet<>();


        names.add("Kunal");
        names.add("Haley");
        names.add("Abby");
        names.add("Lexi");
        names.add("Parker");
        names.add("Julia");

        // using lambda
        //names.forEach(System.out::println);

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());

        }
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);

        System.out.println(numberList);

        //Set<Integer> numberSet = new HashSet<>(numberList);

        // TreeSet offers natural order
        // HashSet is much faster than TreeSet
        Set<Integer> numberSet = new TreeSet<>(numberList);
        //numberSet.addAll(numberList);
        System.out.println(numberSet);

        /*

        for (String name : names) {
            System.out.println(name);
        }

         */

        // enhanced for loop

        //names.clear();
        //names.remove("Kunal");
        //System.out.println(names);
        //System.out.println(names.isEmpty());

    }

}
