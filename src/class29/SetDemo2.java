package class29;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SetDemo2 {
    public static void main(String[] args) {

        //does not allow duplicates as well as HashSet but retains insertion order
        LinkedHashSet<String>fruit=new LinkedHashSet<>();
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Mango");

        System.out.println(fruit);
    }
}
