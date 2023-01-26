package class13.Homework;

public class Task5 {

    public static void main(String[] args) {

       /* 5) How would you check if String is palindrome or not? aba=> true
        Abbc =>false*/


        String word1 = "aba";
        String word2 = "Abbc";

        //Change strings to lowercase
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        String reverse="";

        for (int i = word1.length() - 1; i >= 0; i--) {

            reverse = reverse + word1.charAt(i);}

            if (word1.equals(reverse))
                System.out.println("Entered string/number is a palindrome.");
            else
                System.out.println("Entered string/number isn't a palindrome.");

         for (int i = word1.length() - 1; i >= 0; i--) {

            reverse = reverse + word2.charAt(i);}

            if (word2.equals(reverse))
                System.out.println("Entered string/number is a palindrome.");
            else
                System.out.println("Entered string/number isn't a palindrome.");

    }}




