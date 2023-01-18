package class9;

public class ArraysDemo8 {
    public static void main(String[] args) {

        double [] arr={10.5,12.0,45,10.5,23,10.5};
        //write how many times 10.5 is inside the array
int count=0;
        for (int i=0;i< arr.length;i++){
            if(arr[i]==10.5){
                count++;
            }
        }System.out.println(count);


    }
}
