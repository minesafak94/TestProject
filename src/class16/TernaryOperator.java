package class16;

public class TernaryOperator {


    public static void main(String[] args) {
        int number = 0;
    /*    if(3>2) {
            number = 10;
        }else{
            number=20;
        }
        System.out.println(number=10);

*/
        //you could do it this way as well, but not seen that much!

       number=(3>2)?10:20;
       number=(3>2)?(4>5)?15:65:20;//nested if not used
    }
}