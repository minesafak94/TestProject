package class5.homework;

import java.util.Scanner;

public class HW8

       /* Allow user to enter grade and then provide explanation:
        A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
        At the end your program should print which grade was entered by a user with explanation.
        */
        {
                public static void main(String[] args) {
                        Scanner scanner=new Scanner(System.in);

                        System.out.println("Please enter your grade:");
String grade=scanner.next();

if (grade.equalsIgnoreCase("A")){
        System.out.println("Excellent");
}else if (grade.equalsIgnoreCase("B")){
        System.out.println("Good");
}else if (grade.equalsIgnoreCase("C"))
{
                System.out.println("Average");
                }else if (grade.equalsIgnoreCase("D"))
                {
                System.out.println("Bad");
                }else {
                System.out.println("not acceptable");

                }
}}
