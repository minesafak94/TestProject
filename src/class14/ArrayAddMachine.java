package class14;

public class ArrayAddMachine {
    public static void main(String[] args) {

        int[] array1 = {10, 20, 30, 45, 50};
        addArrayElementsMachine(array1);
    }
    static void addArrayElementsMachine(int [] arr){
        int sum=0;
        for(int  number:arr){
            sum+=number;
        }
        System.out.println(sum);


    }
}
