package HomeworkTestProject.homework5;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        /*6)Write a program to find largest number among three numbers
        using nested if provided by a user (numbers must be distinct)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Type in three numbers");

        int num= scan.nextInt();
        int num2= scan.nextInt();
        int num3=scan.nextInt();


        if (num>num2){
            if (num2 > num3){
                System.out.println("biggest number is " + num);
        }}

                if (num2>num3){
                    if (num2>num){
                System.out.println("biggest number is "+num2);}}

        if (num3>num2) {
            if (num3>num){
                System.out.println("biggest number is "+num3);
            }
        }
       }
    }

