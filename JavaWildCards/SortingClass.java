package JavaWildCards;

import java.util.List;

// the list class is a perfect example of Java generics
// to sort strings we let T reference the String class
// T = type | K = key | V = value
// modify the method only without touching the class = wildcards (~ ? ~)
// generics can also be bounded by bounding generic parameter to the comparable interface
// there can be multiple bounds for the same generic parameter
// if the type we are providing extends only one of these two bounds, this will throw an error


// why cant we use primitive types with generics?
    // generics are a compile-time feature
    // when compiling the generic parameter T will be erased
    // it will be replaced by the "Object" class and "int" does not extend "Object" but "Integer" does

public class SortingClass{
    public List<?> sort(List<? extends Number >unsortedList) {
        // "extends Number" = bounded wildcards
        // List<Integer> = does the sorting
        // (List<Integer> unsortedList) returned the soredList


    }
}
