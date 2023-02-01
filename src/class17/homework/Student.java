package class17.homework;

public class Student {
    //5) Write a Student class   that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.

    String names;
    String addresses;

    public Student(String name, String address) {
        names = name;
        addresses = address;

    }

    void returnInfo(){
        System.out.println("Students name is: "+names+" & his/her address is: "+addresses);
    }

    public static void main(String[] args) {
        Student student=new Student("Jeff","Arkansas");
student.returnInfo();

    }

}