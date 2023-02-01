package class17;

public class StudentTester {
    public static void main(String[] args) {

        Student student1=new Student("203842202348","wlre" ,28,59);
        student1.printInfo();

        Student student2=new Student("2038345342348","lire",21,58);
        student1.printInfo();

        Student student3=new Student("20383532348","Jam",22,57);
        student1.printInfo();

        Student student4=new Student("203840245358","Jey",18,45);
        student1.printInfo();

        Student student5=new Student("2038402342348","mie",38,75);
        student1.printInfo();
    }
}

/*
old version this is time consuming
Student student=new Student();
        student.name="Isabelle";
        student.field="IT";
        student.id="123";
        student.age=27;
        student.weight=165.5;

        Student student1=new Student();
        student1.name="Mateo";
        student1.field="IT";
        student1.id="456";
        student1.age=28;
        student1.weight=175.5;

        Student student2=new Student();
        student2.name="Jorge";
        student2.field="IT";
        student2.id="789";
        student2.age=33;
        student2.weight=200.5;

        Student student3=new Student();
        student3.name="David";
        student3.field="IT";
        student3.id="1231";
        student3.age=29;
        student3.weight=185.5;

        Student student4=new Student();
        student4.name="Marcela";
        student4.field="IT";
        student4.id="1232";
        student4.age=24;
        student4.weight=145.5;


        */
