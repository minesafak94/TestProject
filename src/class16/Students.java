package class16;

public class Students {
    /*Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students*/

    String Name;
    String ID;
    static int numberOfStudents;


    public static void main(String[] args) {


        Students student1 = new Students();
        student1.Name = "Sumair";
        student1.ID= "3204324";
        student1.numberOfStudents++;

        Students student2 = new Students();
        student2.Name = "Hanna";
        student2.ID= "3204342324";
        student2.numberOfStudents++;

        System.out.println(Students.numberOfStudents);

    }
}