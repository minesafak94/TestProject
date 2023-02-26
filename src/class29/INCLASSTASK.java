package class29;

import class1.Main;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class INCLASSTASK {
    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        //How can you remove all duplicates from ArrayList?

        LinkedHashSet<String>linkedhash=new LinkedHashSet<>(aList);
        System.out.println(linkedhash);
    }
}
