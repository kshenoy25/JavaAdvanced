package JavaCollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();

        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));

        al1.add(10);
        al1.add(0,5);
        al1.addAll(1,al2);
        al1.add(5,70);

        //System.out.println(al1.contains(50));
        //System.out.println(al1.indexOf(70));
        //al1.retainAll(al2);
        al1.set(6,100);

        // for each will scan all elements of a list
        // note: ArrayList allows duplicates
        al1.forEach(n->show(n));

        //System.out.println(al1);

        /*
        ListIterator<Integer> it = al1.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

         */

    }
    static void show(int n){
        if (n > 60){
            System.out.println(n);
        }
    }
}
