package JavaCollectionFrameWork;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

// comparing your own objects can be very helpful

class Point implements Comparable{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "x="+x+" y="+y;
    }


    public int compareTo(Object o) {
        Point p = (Point)o;
        if (this.x < p.x)
            return -1;
        else if(this.x > p.x)
            return 1;
        else{
            if(this.y < p.y)
                return -1;
            else if(this.y > p.y)
                return 1;
            else
                return 0;
        }
    }
}

public class ComparableDemo {


    public static void main(String[] args){
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1,1));
        ts.add(new Point(2,2));
        ts.add(new Point(5,5));
        ts.add(new Point(4,3));


        System.out.println(ts);
    }
}

