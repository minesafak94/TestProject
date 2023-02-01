package class17;

public class Student {

    String ID;

    String name;

    int age;

    int weight;


    Student( String studentId, String studentName, int studentAge, int studentWeight){

        ID=studentId;
        name=studentName;
        age=studentAge;
        weight=studentWeight;
    }
    void printInfo(){
        System.out.println("ID "+ID+" Name "+name+" Age "+age+" Weight "+weight);
    }
}