package class8.homework8;

import java.util.Scanner;

public class PriceItem {
    public static void main(String[] args) {

       /*4) Write a program to ask a user to enter 5 item
        they want to buy and the price of that item.

        Every time user enters money accumulate the amount and
        tell the user how much is left to pay off.

        If user
        give more money program should return a change.

        Whenever a user done with payments program should say "Thank you for shopping!"*/

        Scanner scan=new Scanner(System.in);

        int sum=0;
        for (int i=0;i<5;i++) {
            System.out.println("Please enter your item and the price of your item");
            String itemName = scan.next();
            int itemPrice = scan.nextInt();
            sum = sum + itemPrice;
            System.out.println("Your total is " + sum);
        }
        System.out.println("Please pay for the items");


        int amountPaid=scan.nextInt();

        if (sum<amountPaid){
            int change=amountPaid-sum;
            System.out.println("You get "+change+" change");
            System.out.println("thank you for shopping");
        }








    }
}










