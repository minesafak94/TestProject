package HomeworkTestProject.homework5;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {


        /*7) Ask user to enter their country and capture it.
        Once values are captured print which language user speaks.*/


        Scanner scanner=new Scanner (System.in);
        System.out.println("Please type in your country:");
        String country= scanner.next();

       if (country.equalsIgnoreCase("Turkey"))
        {
            System.out.println("You speak turkish");
        }else if(country.equalsIgnoreCase("Spain")){
           System.out.println("You speak spanish");
       }else if(country.equalsIgnoreCase("Italy")){
           System.out.println("You speak italian");
       }else if(country.equalsIgnoreCase("India")){
           System.out.println("You speak indian");
       }else if (country.equalsIgnoreCase("Tunisia")){
           System.out.println("You speak tunisian");
       }else{
           System.out.println("Your language is not listed");
       }






    }}


