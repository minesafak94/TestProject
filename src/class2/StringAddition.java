package class2;

public class StringAddition {
    public static void main(String[] args) {
        String firstName="George";
        // man kann vor George ein Leerzeichen eingeben oder im Sout einfach nochmal mit + " " + ein Leerzeichen erzeugen
        String lastName="Michael";

        /*
        java executes code from top to bottom but if we have multiple operations
        on the same lines it executes them from left to right
         */

        System.out.println(firstName+" "+ lastName);
        System.out.println("First name ="+ firstName);
        System.out.println("Last name ="+ lastName);

        System.out.println("10"+"10");
        /* if you give java " " sth in this, it thinks its a string and combines just, so you have to
        choose integer data type and define your numbers for calculation in java
         */
        String space=" ";
        System.out.println(firstName+space+lastName);
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName+10);
        System.out.println(firstName+10.5);
        System.out.println(firstName+true);
    }
}
