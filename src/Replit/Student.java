package Replit;

public class Student {

    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism*/

    String idNumber;

    int semester;

    String name;


    public void students(String idNumber,int semester){
        System.out.println(idNumber+" "+semester);}

    public void student1(String idNumber){
        System.out.println(idNumber+" ");
    }





}


class SyntaxStudent extends Student{
    public void student1(String semester,String idNumber){
        System.out.println(idNumber+" ");
    }

}


class CollegeStudent extends Student{
    public void students(int semester){
        System.out.println(" "+semester);}
}

class SchoolStudent extends Student{
    String city;
public void school(String idNumber, int semester, String city){
    System.out.println(idNumber+" "+semester+" "+city);
}

}

class Tester {
    public static void main(String[] args) {
        Student []stu={new CollegeStudent(),new SchoolStudent()};

                for (Student student:stu){

                    student.students("33902",2);
                    student.student1("3322");
                    student.students("3323jldsf4",4);


                }
    }
}
