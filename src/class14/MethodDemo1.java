package class14;

public class MethodDemo1 {
    public static void main(String[] args) {

        int[] array1 = {10, 20, 30, 45, 50};

        int sum = 0;

        for (int i : array1) {
            sum += i;
        }
        System.out.println(sum);
        //with sout(Arrays.toString(array1)); gives all the values in array1 out!

        int[] array2 = {10, 10, 10, 20, 30};

        int sum2=0;
        for (int number:array2){
            sum2+=number;
        }
        System.out.println(sum2);





    }
}