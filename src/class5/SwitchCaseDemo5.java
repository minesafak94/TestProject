package class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main (String [] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender 'F' or 'M'!");
        char gender=scanner.next().charAt(0);
        switch (gender){
            case 'f':
            case 'F':
                System.out.println("Female");
                break;
                //you can write to big cases but can do it like below as well
            case 'm':
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified");
        }
    }
}
