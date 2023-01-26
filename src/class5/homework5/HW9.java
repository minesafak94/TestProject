package class5.homework5;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        /*8)HomeWork: Using scanner class create calculator.
        Allow user to enter 2 numbers and operator(+,-,*,/).
        Based on operator provide the result to user.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Please type in the operator");
        char operator = scanner.next().charAt(0);

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        }

    }
}
