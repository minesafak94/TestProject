package HomeworkTestProject.homework4;

import java.util.Scanner;

public class degree {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Do you have a degree?");
        boolean degree=input.nextBoolean();

        if (degree==true) {
            System.out.println("Congratulations! What is your gpa score?");
        }else System.out.println("You have to get a degree");


        int gpa=input.nextInt();

        if (gpa>3.5){
            System.out.println("You are eligible for scholarship!");
        }else{
            System.out.println("You should have studied harder!");
        }
}}