package class17.homework;

public class Students {
    //2)Write a java Class Students that have a constructor
    // which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade.
    // Test Student class for 5 different students with different marks.
    // Your program should print an average mark of each students name.
    String name;

    int grade1;
    int grade2;
    int grade3;


    Students(String nname,int ggrade1,int ggrade2,int ggrade3) {
        name = nname;
        grade1 = ggrade1;
        grade2 = ggrade2;
        grade3 = ggrade3;
    }


    public int averageGrade(int grade1, int grade2, int grade3) {
        int calc = ((grade1 + grade2 + grade3) / 3);
        int result=calc;
        return result; }

    void printInfo() {
            System.out.println("The Student: " + name + " " + "has an average Gade of: " + averageGrade(grade1,grade2,grade3));
        }


    }



   /* public Students(String sName,int subject1,int subject2, int subject3){

        System.out.println(sName+ " average marks are : "+ calculateAverage(subject1,subject2,subject3));


    }
    int calculateAverage(int s1,int s2, int s3){
        int totalMarksAvg=0;
        totalMarksAvg=(s1+s2+s3)/3;
        return totalMarksAvg;

    }
    package constructor;

public class StudentsTester {
    public static void main(String[] args) {


    Students David=new Students("David",75,85,95);
    Students Asli=new Students("Asli",75,75,75);
    Students Zafar=new Students("Zafar",60,70,80);
    Students Slava=new Students("Slava",50,50,50);
    Students Fouzia=new Students("Fouzia",100,100,100);
}}
}

*/