package class3.homeworkjava;

import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
        int temp=input.nextInt();

        if (temp>32){
            System.out.println("Water will NOT freeze with temperature");
        }else{
            System.out.println("Water will freeze with temperature");
        }
    }
}
