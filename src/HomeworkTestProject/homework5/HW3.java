package HomeworkTestProject.homework5;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {


    /*3) Write a program that will read three inputs of scores
    (quiz, mid term, and final scores) and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("Type in your score for quiz");
        int quiz= scanner.nextInt();
        System.out.println("Type in your score for mid term");
        int midTerm= scanner.nextInt();
        System.out.println("Type in your final scores");
        int finalScore= scanner.nextInt();

        int average=((quiz+midTerm+finalScore)/3);

        if (average>90){
            System.out.println("Grade A");
        }else if(average>=70&&average<90){
            System.out.println("Grade B");
        }else if (average>=50&&average<70){
            System.out.println("Grade C");
        }else if (average<50){
            System.out.println("Grade F");
        }



    }
}