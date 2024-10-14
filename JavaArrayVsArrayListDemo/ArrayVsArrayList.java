package JavaArrayVsArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        // arrays have a fixed size
        //String[] numberOfFriends = new String[10];

        String[] friendsNames = {"Abby", "Parker", "Lexi", "Chris", "Javi"};

        // <> is specified as a diamond operator
        // big benefits of ArrayList is that they do not have a fixed size
        // the ArrayList can hold only objects but supports wrapper types for primitives
        ArrayList<String> friendsList = new ArrayList<>();

        ArrayList<String> newFriendsList =
                new ArrayList<>(Arrays.asList("Brian", "Peter", "Lana", "Chase", "Josie"));

        // get the element
        //System.out.println(friendsNames[1]);
        //System.out.println(newFriendsList.get(2));

        // get the size
        //System.out.println(friendsNames.length);
        //System.out.println(newFriendsList.size());

        // adding an element
        // you can't do this with arrays :(
        newFriendsList.add("Kyle");
        //System.out.println(newFriendsList.get(4));

        // set the element
        friendsNames[0] = "Carl";
        //System.out.println(friendsNames[0]);

        newFriendsList.set(0,"Carl");
        //System.out.println(newFriendsList.get(0));

        // arrays cannot remove elements
        //newFriendsList.remove(0);
        newFriendsList.remove("Josie");
        //System.out.println(newFriendsList);

        //print
        System.out.println(friendsNames);
        System.out.println(newFriendsList);

        // the ArrayList<> is more beneficial than Arrays

    }
}
