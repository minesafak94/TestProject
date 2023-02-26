package class29.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class two {


    public static void main(String[] args) {
        /*Create a Set collection that will hold Objects of Student Type.
          In this set we do not care about the insertion order.
          Each student object should have name and studentID. Display name of each student.*/


        HashMap< String, Integer> student=new HashMap<>();

        student.put("Sare",12243);
        student.put("Nejla",12532);
        student.put("Simon",20224);
        student.put("Donna",32324);
        student.put("Vincent",11124);


        System.out.println(student.keySet());//the first instance of HashMap<String, Integer>=> String is retrieved
       // System.out.println(student.values(); //nur die zweite Haelfte





    }
}
