package class4.homework4;

import java.util.Scanner;

public class jtestTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("In:");
        int num = input.nextInt();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        if (num >= 0) {
            System.out.println(num + " is positive");
        } else if (num <= 0) {
            System.out.println(num + " is negative");
        } else if (num == 0) {
            System.out.println("Entered number is equals to 0");
        }

    }}