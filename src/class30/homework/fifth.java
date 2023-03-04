package class30.homework;

import java.util.ArrayList;

public class fifth {
    /*
5)Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
*/
    public static void main(String[] args) {


        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(123);
        sum.add(13);
        sum.add(63);
        sum.add(653);
        sum.add(53);

      int add=0;
      for (int addition:sum){
          add+=addition;

      }
        System.out.println(add);
    }
}