package class2;

public class OperatorsDemo {
    public static void main(String[] args) {
        int number=10;
        // we cant name the variable number again number with int, it is not allowed

        System.out.println(number);

        int number1=10;
        //if you use int and get any decimal number it will ignore and you will loose information, use float!!!
        int number2=20;
        System.out.println(number1+number2);//addition
        //Put your cursor anywhere on a line and press CTRl+D or CMD+D to duplicate it.
        System.out.println(number1-number2);//subtraction
        System.out.println(number1/number2);//division

        /*
        If you have to store whole numbers always use int
        If you have to store decimal numbers always double
        If you have to store characters you can always use String
         */
    }

}
