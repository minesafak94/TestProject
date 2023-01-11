package class5;

public class SwitchCaseDemo3 {
    public static void main (String [] args) {

        /*
        we can only use byte short int char String if switch case is in use
        boolean rich=true;


        //we cant use relational operators with switch case statement
        int number=10;
*/

        String day ="Friday";
        switch (day){
            case "Monday":
                System.out.println("1");
                break;
            case "Tuesday":
                System.out.println("2");
                break;
            case "Wednesday":
                System.out.println("3");
                break;
            case "Thursday":
                System.out.println("4");
                break;
            case "Friday":
                System.out.println("5");
                break;
            default:
                System.out.println("Wrong day");

        }

    }}

