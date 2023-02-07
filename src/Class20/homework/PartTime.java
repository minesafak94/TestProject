package Class20.homework;

public class PartTime extends Employee{


    int hour;

    String department;
    PartTime(String employeeName,int employeeNumber, String companyName, int hour, String department ){
       super(employeeName, employeeNumber, companyName);
       this.hour=hour;
       this.department=department;
    }

    void printInfo(){
        System.out.println(employeeName+" "+employeeNumber);
    }

    public static void main(String[] args) {

        PartTime part=new PartTime("Hanna",23,"Lovely",20,"marketing");
        part.printInfo();
    }
}
