package Project;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //1)Using Scanner create an array of integer values.
        // After the array is created, calculate the sum of all stored elements in that array.

        Scanner scanner=new Scanner (System.in);

        int [] arr=new int[5];
        int sum=0;

        for (int i = 0; i<=arr.length;i++){
            arr[i]=scanner.nextInt();
            sum=sum+arr[i];
            System.out.println(sum);

        }
        System.out.println();
    }
}
