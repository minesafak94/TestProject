package HomeworkTestProject.homework4;

import java.util.Scanner;

public class salaryYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please type in the number of years you worked!");
        int years=input.nextInt();

        if (years>=5){
            System.out.println("Your eligible for a bonus! Please type in your annual salary!");
        }else{
            System.out.println("You are not eligible for a bonus");
        }
        int salaryYear=input.nextInt();
            if ((years >= 5) && (salaryYear>=50000))
            {
                System.out.println("Your bonus=5000");
            }
               if ((years >= 5) && (salaryYear<=50000))
               {
                    System.out.println("Your bonus = 3000");
                }

        }}
