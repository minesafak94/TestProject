package Replit;

import java.util.Scanner;

public class replit76Array {
            public static void main (String [] args){

                Scanner scan=new Scanner(System.in);


                String [] arr=new String [7];

                for (int i=0;i<arr.length;i++){
                    System.out.println("Please enter day "+i+" of the week");
                    String day=scan.next();
                    arr[i]=day;
                }

                for (int i=0;i<arr.length;i++){
                    System.out.println(arr[i]);
                }


            }}