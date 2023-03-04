package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Mahir");
        studentsMap.put(3,"Nehir");
        studentsMap.put(4,"Fatma");
        studentsMap.put(5,"Mira");
        studentsMap.put(6,"Deniz");
        studentsMap.put(7,"Sadik");

        Set<Entry<Integer,String>> entrySet=studentsMap.entrySet();

        for(Entry<Integer,String> entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        entrySet.removeIf((x->x.getKey()>2&&x.getValue().contains("i")));

        System.out.println(entrySet);

    }
}
