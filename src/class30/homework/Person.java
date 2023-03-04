package class30.homework;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Person {
    /*2) Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
*/
    private String name;
    private String lastName;
    private int age;
    private double salary;

    Person(String name,String lastName,int age, double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public double getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }

    void userDetails(){
        System.out.println("The following details are from User: "+getName()+" "+getLastName()+" "+getAge()+" "+getSalary());
    }


}

class Test{

    public static void main(String[] args) {


        Map<Integer,String>test=new TreeMap<>();

        test.put(12323123,"Jenny");
        test.put(33323123,"Penny");
        test.put(32323123,"Kenny");
        test.put(42323123,"Sandy");
        test.put(52323123,"Jerry");

        Collection<Integer>s=test.keySet();

        for (Integer i:s){
            System.out.println(i+" "+test.get(i));
        }







    }





}
