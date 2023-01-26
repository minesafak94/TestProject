package class13.Homework;

public class Task2 {
    public static void main(String[] args) {
        //2) Create a String that should be combination of letters,
        // numbers and special characters. Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String chars=" a b c d d d e  s f  s f s f 342098430990 %^$&%$%&*$^%&";

        int count=0;
        for (int i=0;i<chars.length();i++){
        if (Character.isAlphabetic(chars.charAt(i))){
        count++;
        }else if
            (Character.isDigit(chars.charAt(i))){
            count++;
            }
        }
        System.out.println(count);
    }}

