package class29;

import java.util.HashSet;

public class SetsDemo1 {
    public static void main(String[] args) {

        HashSet<String> fruit=new HashSet<>();
        //duplicate value will be discarded
        //order isnt in inserting order, its alphabetic
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Orange");

        System.out.println(fruit);
    }
}
