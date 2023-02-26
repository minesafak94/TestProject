package class28.homework;

import java.util.ArrayList;

public class zero4 {
    public static void main(String[] args) {
        /*4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
         */

        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("mineral water");
        drinks.add("cola");
        drinks.add("ginger ale");


            for (int i = 0; i < drinks.size(); i++) {
                String drink = drinks.get(i);
                if (drink.contains("a") || drink.contains("e")) {
                    drinks.set(i, "Water");// with this you can set new array values and use i for looping through the list
                }
            }

            System.out.println(drinks);
        }
    }

