package class29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class InClassTask2 {
    public static void main(String[] args) {
        /*Create a Set collection in which you need to add names of the countries.
        In this set we want all objects to be sorted in alphabetical order.
        Using 2 different ways retrieve all elements from set.*/


        TreeSet<String> countries=new TreeSet<>();
        countries.add("turkey");
        countries.add("germany");
        countries.add("germany");
        countries.add("usa");
        countries.add("georgia");
        countries.add("georgia");

        System.out.println(countries);

        for(String c:countries) {
            System.out.println(c);
        }
    }
}
