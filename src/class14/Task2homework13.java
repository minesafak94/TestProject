package class14;

public class Task2homework13 {
    public static void main(String[] args) {

//2) Create a String that should be combination of letters,
        // numbers and special characters. Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

String str="shdfskdjfis2349283@#$@$";
        System.out.println(str.replace("[^A-Za-z0-9]","").length());
        System.out.println(str);





    }
}
