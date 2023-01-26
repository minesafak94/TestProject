package class13;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*3)
Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL*/


    /*    Scanner scan=new Scanner(System.in);

        System.out.println("Mom’s first name?");
        String name1=scan.next();


        System.out.println("Dad’s first name?");
        String name2=scan.next();

        System.out.println("Are you expecting a boy or a girl");
        String gender=scan.next();

        System.out.println("Suggested baby name");
        System.out.println((name1.substring(0,2))+name2.substring(3,6));*/




        System.out.println(";;;;;;;;;;;;");
        //else block included
        String dadsName="Daniel";
        String momsName="Mary";

        String expectation="Boy";
        String firstHalf="";
        String secondHalf="";

        if (expectation.equalsIgnoreCase("boy")) {
             firstHalf = dadsName.substring(0, dadsName.length() / 2);
             secondHalf = momsName.substring(momsName.length() / 2);
        }else{
             firstHalf = momsName.substring(0, momsName.length() / 2);
             secondHalf = dadsName.substring(dadsName.length() / 2);}
        System.out.println(firstHalf+secondHalf);
}}
