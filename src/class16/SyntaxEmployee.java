package class16;

public class SyntaxEmployee {
    /*Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
*/

    int empID;
    double salary;
    static String CEO = "Sumair";


    public static void main(String[] args) {


        SyntaxEmployee employee1 = new SyntaxEmployee();
        employee1.empID = 309243;
        employee1.salary = 100000;


        SyntaxEmployee employee2 = new SyntaxEmployee();
        employee2.empID = 30923;
        employee2.salary = 100900;


        System.out.println(employee2.empID+" "+employee2.salary+" "+CEO);
        System.out.println(employee1.empID+" "+employee1.salary+" "+CEO);

    }

}

