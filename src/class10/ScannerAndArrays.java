package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int[] arr = new int[5]; //to create an empty array
/*below code manually store numbers in the array
        arr[0]=scanner.nextInt();
        arr[1]=34;
        arr[4]=20;
        arr[3]=33;
        arr[2]=34;
        */

    /*    below code take the numbers from user and store them in the array its good but a lot of code

        arr[0]=scanner.nextInt();
        arr[1]=scanner.nextInt();
        arr[4]=scanner.nextInt();
        arr[3]=scanner.nextInt();
        arr[2]=scanner.nextInt();*/

        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));


}}