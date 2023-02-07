package Class20.homework;

public class Employee {

    /*2. Create an Employee class that will have variables and methods.
    Constructor that should initialize instance variables
Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code!*/

    String employeeName;
    int employeeNumber;

    String companyName;


     Employee(String employeeName, int employeeNumber, String companyName){ //use always class name for constructor!!!

        this.employeeNumber=employeeNumber;
        this.employeeName=employeeName;
         this.companyName=companyName;
    }

    void company(){
        System.out.println("The employee Name is: "+employeeName+" ,the number of employees is: "+employeeNumber+" the companies name is: "+companyName);
    }

}

