package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Mahir");
        studentsMap.put(3,"Nehir");
        studentsMap.put(4,"Fatma");
        studentsMap.put(5,"Mira");
        studentsMap.put(6,"Deniz");
        studentsMap.put(7,"Sadik");

        //for keys we use keySet() method
        //for values we use the whole collection(parent of all)

        Collection<String>values=studentsMap.values();//nur die Namen werden hier gespeichert
        System.out.println(values);

        //remove all values, which contain the letter i
        values.removeIf(x->x.contains("i"));
        System.out.println(values);
    }
}
