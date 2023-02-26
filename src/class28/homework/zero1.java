package class28.homework;

import java.util.ArrayList;

public class zero1 {
    /*1) Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that*/

    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList<>();
        name.add("Jane");
        name.add("Maria");
        name.add("Hanna");
        name.add("Mehmet");
        name.add("Mine");

        System.out.println(name.isEmpty());//boolean to check if the array is empty or not with isEmpty();

        System.out.println(name.contains("Jane"));//boolean as well, checks if value available
        System.out.println(name.size());//size
        System.out.println(name);//print all
    }
}
