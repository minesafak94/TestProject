package class29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {

//no maintain of insertion order
        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Mango");

        System.out.println(fruit);
    }
}
