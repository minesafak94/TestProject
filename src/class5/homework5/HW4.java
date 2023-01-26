package class5.homework5;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        /*
4)Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =”Summer”.
At the end of the program we should see output as “You were born __”.*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your birth month!");
        String month=scanner.next();

        switch (month) {
            case "January":
            case "February":
            case "March":
                System.out.println("You were born in Spring");
                break;

            case "April":
            case "May":
            case "June":
                System.out.println("You were born in Summer");
            break;
            case "July":
            case "August":
            case "September":
                System.out.println("You were born in Autumn");
            break;
            case "October":
            case "November":
            case "December":
                System.out.println("You were born in Winter");
                break;

            default:
                System.out.println("You arent born");
        }




    }
}
