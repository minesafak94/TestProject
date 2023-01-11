package class6;

import java.util.Scanner;

public class LogicalOrDemo {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("What day is today?");
        String day=scanner.next();

        if ((day.equalsIgnoreCase("Monday"))||day.equalsIgnoreCase("Friday")){
            System.out.println("No Class today, enjoy");
        }else if ((day.equalsIgnoreCase("Saturday"))||day.equalsIgnoreCase("Sunday")){

            System.out.println("Java Class Enjoy");
        }else if ((day.equalsIgnoreCase("Wednesday"))||day.equalsIgnoreCase("Tuesday")){
            System.out.println("Manual testing class");
        }else if(day.equalsIgnoreCase("Thursday")){
            System.out.println("Review Class");
        }else{
            System.out.println("Wrong day");
        }
        scanner.close();

// damit schliesst man den Scanner


    }
}
