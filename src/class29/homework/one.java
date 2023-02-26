package class29.homework;

import java.util.LinkedHashSet;

public class one {
    public static void main(String[] args) {
        /*Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with “A”;*/

        LinkedHashSet<String>cities=new LinkedHashSet<>();
        cities.add("Berlin");
        cities.add("Washington");
        cities.add("Amsterdam");
        cities.add("Antwerp");
        cities.add("Brussels");

        cities.removeIf(c->c.startsWith("A"));
        System.out.println(cities);
    }
}
