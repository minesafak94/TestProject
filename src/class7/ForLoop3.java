package class7;

public class ForLoop3 {
    public static void main(String[] args) {
/*When u know exactly how many times you want to loop
through a block of code, use the for loop instead of a while loop
when we don't know how many times we need to repeat a block of coe we
should be going with while loop most of the time it happens when the user
input is involved
*/
        int number=0;
        while (number<10){
            System.out.println(number);
            number++;
        }

        /*
        process
        int number=10;
        number<10
        sout(number);
        number++;
        number<10
        sout(number)
        */
    }
}
