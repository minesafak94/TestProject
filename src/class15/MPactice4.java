package class15;

public class MPactice4 {


        /*
        create a method that takes two numbers as parameters and return the larger number
        */

        int returnLarger(int num1, int num2){
            if (num1>num2){
                return num1;
            }else {
                return num2;
            }}
    public static void main(String[] args) {

        MPactice4 mp = new MPactice4();
        System.out.println(mp.returnLarger(12, 14));

    }

}





