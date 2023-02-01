package class15;

public class MPractice3 {
    /*
   Create a method that takes an array of int, //return type=>int
   sum all the elements from the array,// name of method =>arraySum
   return the sum

   //parameters=> int [] arr
     */

    
    int arrSum (int [] arr){

        int sum=0;
        for (int num:arr){
            sum+=num;
        }
        return sum;

    }}
  /*  int [] arr={10,20,30};
    int sum=0;
    for (int num:arr){
        sum+=num;
    }}*/
