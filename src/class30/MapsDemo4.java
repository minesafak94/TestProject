package class30;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo4 {//this class is important!!!!!
    public static void main(String[] args) {
        HashMap<String,Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.90);
        makeup.put("Mascara",5.90);
        makeup.put("Foundation",23.90);
        makeup.put("Eyeliner",5.90);


        //for storing all those keys, I have to use Set, u can also use ArrayList
        Set<String>allKeys=makeup.keySet();//u linked makeup with the set allkeys
        // if u change anything it will be changed everywhere
        System.out.println(allKeys);

        //for retrieving the value
      /*  for (String s:allKeys){
            System.out.println(s);}*/


        //Delete all the entries from the map for which the size of key
        // is greater than 7

        allKeys.removeIf(x->x.length()>7);
        System.out.println(allKeys);

    }
}//behind the scenes it will be removed from map
