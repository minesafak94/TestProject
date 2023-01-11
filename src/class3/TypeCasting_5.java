package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        /*byte shorterNumber=number; store the value in number into shorterNumber
        the problem is you cant fit long into byte, if the value is fitting in into byte than
        you have to (byte) number;
        see below
         */
        byte shorterNumber=(byte) number;
        float f=10.5f;
        int num= (int) f;// we force java to fit float into int

        /*
        byte
        short
        int
        long
        float
        double
         */
        System.out.println(shorterNumber);
        System.out.println(num);

        byte b=10;
        int number2=b;
        short c= (short) number2;

        /* byte into int is okay/ int into short is not okay, bigger boxes into smaller boxes is problematic,
        you have to type cast like short c= (short) number2
         */

        float eggs=12.5f;
        int wholePart= (int) eggs; //type casting we are converting from float to an int

        System.out.println(wholePart);

        System.out.println((char)98);
    }
}
