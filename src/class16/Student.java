package class16;

import javax.xml.namespace.QName;

public class Student {
    String name;
    static String schoolName;

    String id;

    int age=10;

    double weight;


    void printName(){
        System.out.println(name);
        System.out.println(schoolName);
    }

    static void printStudentInfo(){
      //  System.out.println(name);//cant access here
        System.out.println(schoolName);
    }
}
