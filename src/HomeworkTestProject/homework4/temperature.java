package HomeworkTestProject.homework4;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter city");

        String city=input.next();

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);

        System.out.println("The celsius is "+celsius);
        }
    }

