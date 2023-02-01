package class16;

public class inClassTask {
    /*Create a method that will accept an array as parameters
    and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible
    by the creating an instance of the class*/

 // return type = int;
    //name of method =sumArraysElement
    //parameters=> int [] arr

    int sumArraysElements(int[]array){
        int sum=0;
        for (int num:array){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int []arr={10,25,35,45};
        inClassTask task7=new inClassTask();
        System.out.println(task7.sumArraysElements(arr));
    }
}
