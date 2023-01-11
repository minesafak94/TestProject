package class4.homework;

import java.util.Scanner;

public class mortgage {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Is the mortgage higher than 4.5%?");
        boolean mortgageRate= input.nextBoolean();


        if(mortgageRate){
            System.out.println("User doesnt consider to buy a house!");
        }else if(mortgageRate!=true){
            System.out.println("User considers to buy a house!");
        }

        System.out.println("How much does the mortgage cost?");
        int mortgagePrice=input.nextInt();
        if(mortgagePrice>200000){
            System.out.println("You have to take a loan!");
        }else{
            System.out.println("You can pay cash!");
        }
    }
}
