package JavaCollections;

import java.util.ArrayDeque;

public class ArrayDQ {
    // this interface extends the Queue interface
    // dequeue = first in first out
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(10);
        dq.offer(20);
        dq.offer(30);
        dq.offer(40);

        // nothing but the stack
        dq.pollLast();

        /*
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);

         */


        // lambda expression
        dq.forEach((x)-> System.out.println(x));



    }
}
