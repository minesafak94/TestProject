package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {

        ArrayList<Double>numbers=new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(13.1);
        numbers.add(12.7);
        numbers.add(13.9);
        numbers.add(11.3);

        //remove one single object from list
      // numbers.removeIf(number -> number > 11); use this instead of all

// getting the object of iterator
        Iterator<Double>iterator =numbers.iterator();
/*
        System.out.println(iterator.hasNext());//just boolean, returns true false
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());*/
        //instead of writing this much code like above, we just write a while-loop like below

        //hasNext keeps on returning true as long as there are elements left to be iterated
        while(iterator.hasNext()){
           double number= iterator.next();//we get elements one by one
            if (number>11){
                iterator.remove();
            }//or use that one line unter the arrray list above => called lamda
        }


        System.out.println(numbers);
    }
}
