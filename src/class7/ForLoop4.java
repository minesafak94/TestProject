package class7;

public class ForLoop4 {
    public static void main(String[] args) {

        // 12 45 78 10 11 13 14 16 17 19;

        for (int number=0; number<20; number++){
            if (number%3!=0) {//this condition divides all numbers by 3 and remainder is 0
                System.out.println(number);
            }
        }
    }
}
