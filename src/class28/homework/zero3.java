package class28.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class zero3 {
    /* 3)Create an arrayList of words. Remove every word that ends with “e”. */
    public static void main(String[] args) {


        ArrayList<String> word = new ArrayList<>();
        word.add("empathize");
        word.add("working");
        word.add("change");
        word.add("learning");

        word.removeIf(x -> x.endsWith("e"));
        System.out.println(word);

    }

}