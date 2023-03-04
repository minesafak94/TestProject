package class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));//value on the index3
        System.out.println(studentsMap.size());//how many entries
        System.out.println(studentsMap.containsKey(4));//is there a key in index 4//
        System.out.println(studentsMap.containsValue("Anush"));//is there a value like Anush

        System.out.println(studentsMap.remove(1));;
        System.out.println(studentsMap);
        System.out.println(studentsMap.replace(2,"shah"));
        System.out.println(studentsMap);
    }
}
