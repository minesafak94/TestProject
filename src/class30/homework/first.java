package class30.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class first {
    /*1) Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
*/
    public static void main(String[] args) {


        Map<Integer, String> bestBuy = new HashMap<>();

        bestBuy.put(3040934,"Radio");
        bestBuy.put(1232234,"Television");
        bestBuy.put(3420934,"Smartphone");
        bestBuy.put(1230934,"Laptop");
        bestBuy.put(1121934,"Airfryer");

        Set<Map.Entry<Integer,String>> entrySet=bestBuy.entrySet();

        for(Map.Entry<Integer,String> entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }





    }
}