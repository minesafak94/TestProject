package class29;

import java.util.HashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        //HashMap<String,Integer>groceries=new HashMap<>();
        //LinkedHashMap<String,Integer>groceries=new LinkedHashMap<>();
        TreeMap<String,Integer> groceries=new TreeMap<>(); // sort data according to the keys alphabetically

        groceries.put("Eggs",18);
        groceries.put("Tomatoes",8);
        groceries.put("sugar",12);
        groceries.put("beans",1);
        groceries.put("Asparagus",13);
        groceries.put("Egs",12);

        System.out.println(groceries.get("sugar"));
        System.out.println(groceries);

        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
        groceries.remove("beans");
        System.out.println(groceries);

    }
}
