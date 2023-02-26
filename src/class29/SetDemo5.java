package class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo5 {

        public static void main(String[] args) {
            //insertion order is retained
          ArrayList<Integer> num=new ArrayList<>();
            num.add(2);
            num.add(23);
            num.add(1);
            num.add(1);
            num.add(1);
            num.add(2);
            System.out.println(num);

            //
            LinkedHashSet<Integer>uniqueNumbers=new LinkedHashSet<>(num);//um die Liste hier einzufuegen
            System.out.println(uniqueNumbers);
        }
    }

