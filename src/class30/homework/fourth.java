package class30.homework;

import java.util.TreeSet;

public class fourth {
    /*

    4)

        Create the collection that will store single uniques Objects of a String type in which order is preserved.
        Write a logic to concatenate all string from the collection.
    */
    public static void main(String[] args) {


        TreeSet<String> unique = new TreeSet<>();
        unique.add("James");
        unique.add("Unique");
        unique.add("Jamie");

        for (String s:unique){
        System.out.println(s);

    }
}}