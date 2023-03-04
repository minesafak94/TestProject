package class30;

import java.util.TreeMap;

public class MapDemo9 {
    public static void main(String[] args) {
        /*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/
        TreeMap<String,String> country=new TreeMap<>();
        country.put("Turkey","Ankara");
        country.put("United States","Washington D.C.");
        country.put("Germany","Berlin");
        country.put("Holland","Amsterdam");

    var values=country.values();
    for (var value:values){
        System.out.println(value);
    }

    var iterator=country.values().iterator();
    while(iterator.hasNext()){
        var value=iterator.next();
        System.out.println(value);
    }

    }
}
