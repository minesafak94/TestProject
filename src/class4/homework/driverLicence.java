package class4.homework;

import java.util.Scanner;

public class driverLicence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Type in your age");

        int age=input.nextInt();

        if (age>=18){
            System.out.println("Your driver licence will be issued");
        }else{
            System.out.println("You have to get a learners permit!");
        }
    }
}
