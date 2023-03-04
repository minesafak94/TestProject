package class30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo8 {
    /*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/
    public static void main(String[] args) {

        TreeMap<String,String>country=new TreeMap<>();
        country.put("Turkey","TR");
        country.put("United States","USA");
        country.put("Germany","DE");
        country.put("Holland","NL");

       //Set<Map.Entry<String,String>> entrySet=country.entrySet();
        //for this u can replace with var like right below
        var entrySet=country.entrySet();
        for (var entry:country.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());

        }

        var iterator=country.entrySet().iterator();
        while(iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }





        }


    }

