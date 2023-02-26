package class28.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class zero2 {
    public static void main(String[] args) {

        /*2)Create an arraylist of cars and retrieve all the values using 3 different ways.*/

        ArrayList<String>cars=new ArrayList<>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Mercedes");

        //first way: with list name
        System.out.println(cars);


        System.out.println("_________________________________");



        //second way: for loop
        for (int i=0;i<cars.size();i++){
            String car=cars.get(i);
            System.out.println(car);
        }

        System.out.println("_________________________________");


        //and with advanced for loop
        for (String s:cars){
            System.out.println(s);
        }

        System.out.println("_________________________________");

        //the third way: Iterator
        Iterator iter=cars.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }




    }
}
