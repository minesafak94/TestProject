package Project;

public class Task5 {
    public static void main(String[] args) {


    //5)Create a 2D array of integers.
        // Develop a program which will calculate the sum of  even and odd numbers for that array.

        int [][] arr={{22,24,28},{33,31},{34,37,48}};

        int even=0;
        int odd=0;

        for (int [] num:arr){
            for (int num1:num){
                if (num1%2==0){
                    even+=num1;
                    System.out.println(even);
                }else {

                    System.out.println();
                }
            }
        }







}}
