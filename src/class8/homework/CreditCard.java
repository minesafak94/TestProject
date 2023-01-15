package class8.homework;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {

      /* 2) Create a program that will be asking user
        to apply for a credit card 10 times. As soon you get an “yes” from a user program should stop asking. */

        Scanner scan=new Scanner(System.in);
        System.out.println("Apply for a credit card");
        String credit=scan.next();

        for (int i=0;i<10;i++){

           if (credit.equals("no")){
               System.out.println("Apply for a credit card");
               credit=scan.next();
           }
           }
        }
        }



