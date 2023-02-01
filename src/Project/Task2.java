package Project;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //2)Using Scanner create an array of countries.
        // When an array is created, retrieve all values from it and
        // while retrieving those values print capital for each country. (use 2 different loops).

        Scanner scan=new Scanner(System.in);


        String[] countries=new String[5];



        for (int i=0;i< countries.length;i++){

            for (int j=0;j<= countries.length;j++) {
                countries[i] = scan.next();

                System.out.println("The capital of "+countries[i]+" is:"+countries[i].charAt(0));
                System.out.println();


            }

        }
        }

        }


