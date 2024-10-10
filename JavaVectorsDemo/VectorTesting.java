package JavaVectorsDemo;


import java.util.*;

public class VectorTesting {
    public static void main(String[] args) throws InterruptedException {
        // vectors are a collection of objects that offer convenient methods for adding, removing, and manipulating the elements inside
        // on the surface vectors act like ArrayList
        // difference though is performance

        int size = 1000000;


        List<Integer> arrayList = new ArrayList<Integer>(size);

        // adding a million items
        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }

        long end = System.currentTimeMillis();
        // print difference of the end time and the start time
        System.out.println("Added " + size + " elements to ArrayList: " + (end - start) + " ms");

        // declare a vector
        List<Integer> vector = new Vector<>();

        // adding a million items
        start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            vector.add(i);
        }
        end = System.currentTimeMillis();
        // print difference of the end time and the start time
        System.out.println("Added " + size + " elements to Vector: " + (end - start) + " ms");

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // multithreaded approach

        // operations in an ArrayList are not synchronized
        // in other words not thread safe

        // however there is a way to make an ArrayList thread safe
        List<Integer> multiThreadList = Collections.synchronizedList(new ArrayList<>());
        start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadList.add(i);
            }

        });

        start = System.currentTimeMillis();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadList.add(i);
            }

        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        end = System.currentTimeMillis();
        System.out.println("Added elements in a multi threaded way to ArrayList: " + (end - start) + " ms");
        System.out.println("Size is "+ multiThreadList.size());


        // operations in Vectors are synchronized
        // they are thread safe
        List<Integer> multiThreadedVector = new Vector<>();
        start = System.currentTimeMillis();

        t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadedVector.add(i);
            }

        });

        start = System.currentTimeMillis();

        t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadedVector.add(i);
            }

        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        end = System.currentTimeMillis();
        System.out.println("Added elements in a multi threaded way to Vector: " + (end - start) + " ms");
        System.out.println("Size is "+ multiThreadedVector.size());





    }

}
