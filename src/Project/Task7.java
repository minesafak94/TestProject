package Project;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //7)Write a java program to check whether a given number is prime or not?

        Scanner scan=new Scanner(System.in);


        int given=4;
        boolean isPrime=true;

        if (given>1){
            for (int i=2;i<given;i++){
                if (given%i==0){
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }
/*
        int num=scan.nextInt();
int [] prime={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};

    for (int i=0;i<8;i++){
            num=scan.nextInt();
            if(num==prime[i]){
                System.out.println(num);
            }
            System.out.println();
        }*/
    }
}
