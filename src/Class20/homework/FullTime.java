package Class20.homework;

public class FullTime extends Employee{

    int hours;

    String departments;

    FullTime(String employeeName, int employeeNumber, String companyName,int hours) {
        super(employeeName, employeeNumber, companyName);
        this.company();
    }


  /*  FullTime(){
        super("Ferid",324,"Hayat");
    } uneccessary block of code*/


    void full(){
        System.out.println("This is a fulltime job");
    }

    public static void main(String[] args) {
        FullTime full=new FullTime("Jennifer",34,"Lifelong",40);
        full.full();
    }
}
