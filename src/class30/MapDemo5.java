package class30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        Map<Integer,String>studentsMap=new HashMap<>();

        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Mahir");
        studentsMap.put(3,"Nrhir");
        studentsMap.put(4,"Fatma");
        studentsMap.put(5,"Mira");
        studentsMap.put(6,"Deniz");
        studentsMap.put(7,"Sadik");

        //remove all the keys from map above if they are greater than two

        //we can store in Collection instead of Set
        //Collection<Integer>keys...
        Set<Integer>keys=studentsMap.keySet();//when we have this method, we can use method of Set
        System.out.println(keys.removeIf(x->x>2));
        System.out.println(studentsMap);
        System.out.println(keys);//it is also removed from map,not temporary in change
    }
}
