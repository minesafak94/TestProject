package class9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
/*
        4)
        1)Write a program
        2)to ask a user to enter 5 items they want to buy and  the price of that item.
        3) Every time user enters money  accumulate the amount and
        4) tell the user how much is left to pay off.
        5) If user give more money program should return a change.
        6) Whenever a user done with payments program should say
        "Thank you for shopping!"
*/
        Scanner scan=new Scanner(System.in);
        double total=0;

        for (int i=0;i<=5;i++){
            System.out.println("Please type in your item and the price of it");

            String itemName= scan.next();
            double itemPrice= scan.nextDouble();
            total=total+itemPrice;
            System.out.println("Total price you have to pay "+total);
        }

        System.out.println("Please pay for the items");

        double amountPaid=scan.nextDouble();


        if(total<amountPaid){
            double chang=amountPaid-total;
            System.out.println("Hey here is your change "+chang);
        }else if (amountPaid<total){
            System.out.println("You cant buy all the items");
        }
        System.out.println("Thank you for shopping");
    }
}
