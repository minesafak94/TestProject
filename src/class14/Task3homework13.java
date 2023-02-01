package class14;

public class Task3homework13 {
    public static void main(String[] args) {
        //3) You have a
        // String a=
        // ”Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?

        String str="Is it saturday? Is it raining? Do we have a Java Class today?";

   /*    // String [] arr=str.split("[?]");
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);//Index steht im String Array fuer die einzelnen Woerter*/

      //->  this above is bad practice

        System.out.println(str.split("[?]]").length);
    }
}
