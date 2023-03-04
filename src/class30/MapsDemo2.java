package class30;

import java.util.HashMap;

public class MapsDemo2 {
    public static void main(String[] args) {

        HashMap<String,Double>fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Orange",1.79);
        fruit.put("Banana",2.99);
        fruit.put("Kiwi",0.99);
        fruit.put("Apple",3.99);//apple which is later inserted will be retained
        fruit.put(null,null);

        System.out.println(fruit);

        HashMap<String,Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.90);
        makeup.put("Mascara",5.90);
        makeup.put("Foundation",23.90);
        makeup.put("Eyeliner",5.90);

        HashMap<String,Double>groceries=new HashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(makeup);
        System.out.println(groceries);
    }
}
