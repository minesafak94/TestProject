package class4.homework;

import java.util.Scanner;

public class loan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("What is the amount of loan is needed?");

        int loan=input.nextInt();


        if(loan<=200000){
            System.out.println("You can lend the money!");

        }else{
            System.out.println("You ve been rejected!");
        }
    }
}
