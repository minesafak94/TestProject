package class4.homework4;

import java.util.Scanner;

public class creditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a credit card?");
        boolean creditCard = input.nextBoolean();


        if (creditCard==true) {
            System.out.println("What is the balance on the card?");
        }else {
                    System.out.println("Do you want to get a credit card?");
                }

        int balance = input.nextInt();

                if (balance>1000) {
                    System.out.println("Pay off immediately");
                } else {
                    System.out.println("You can spend more!");
                }
            }
        }
