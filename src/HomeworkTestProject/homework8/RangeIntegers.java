package HomeworkTestProject.homework8;

import java.util.Scanner;

public class RangeIntegers {
    public static void main(String[] args) {

       /* 3) Write a program that reads a range of integers
         (start and end point), provided by a user and then from
         that range prints the sum of the even and odd integers.*/

        Scanner scan=new Scanner(System.in);

        System.out.println("Please type in two number, your starting and your ending point");
        int numberStart= scan.nextInt();
        int numberEnd= scan.nextInt();

int sum=0;
        for (int j=numberStart; j<=numberEnd; j++){
            sum=sum+j;
            System.out.print(j+" ");

        }
        System.out.println(" ");
        System.out.println("Your starting point is "+numberStart+" and your ending point is "+numberEnd);
        System.out.println("Your sum is "+sum);


    }
}
