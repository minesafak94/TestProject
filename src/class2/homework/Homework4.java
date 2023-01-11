package class2.homework;

import javax.sound.midi.Soundbank;

public class Homework4 {
    public static void main(String[] args) {

        double a=10.5;
        double b=3.9;
        String same = " of 2 numbers 10.5 and 10.5 is equal to ";
        String square = "The square of the number 3.9 is ";
        //correction; double addition=number1+number2;

        System.out.println("The Addition"+same+(a+a));
        System.out.println("The Subtraction"+same+(a-a));
        System.out.println("The Multiplication"+same+a*a);
        System.out.println("The Division"+same+a/a);
        System.out.println(square+b*b);
    }
}
