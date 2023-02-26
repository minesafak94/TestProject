package class28;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList <String> names=new LinkedList<>();
        names.add("Artema");
        names.add("Elvira");
        names.add("Tammana");
        names.add("Temmuz");
        names.add("Sam");
        System.out.println(names);

        for (String s:names){
            System.out.println(s);
        }
    }


}
