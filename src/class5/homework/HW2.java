package class5.homework;

public class HW2 {

    /*2) Write a program that will print whether it is a weekend or weekday.
    If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”,
    any other day → output “Invalid day”
     */
    public static void main(String[] args) {
        int day=1;

        if (day<=5){
            System.out.println("Its a weekday");
        }else if (day==6||day==7){
            System.out.println("It is weekend");
        }else{
            System.out.println("Invalid output");
        }
    }
}
