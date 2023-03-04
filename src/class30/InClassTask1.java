package class30;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class InClassTask1 {
    /*Create a map of a building. Store floor number
    and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..).
    Insert 7 entries with duplicate keys and values.

    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map*/
    public static void main(String[] args) {
        HashMap<Integer,String>building=new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Facebook");
        building.put(4,"Instagram");
        building.put(5,"Target");
        building.put(6,"Apple");
        building.put(6,"Apple");
        building.put(7,"Samsung");

        System.out.println(building.size());//how many entries
        building.replace(4,"Shell");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);



    }
}
