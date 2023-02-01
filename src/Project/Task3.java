package Project;

public class Task3 {
    public static void main(String[] args) {
        //3) Create a 2D array of integer values. Print the sum of all numbers.
int [][] arr={{3,9,6},{14,36,46},{32,34,32}};




//with enhanced for loop
        int sum=0;
        for (int [] num:arr) {
        for (int num1:num) {
        sum += num1;
}
        }  System.out.println(sum);
            System.out.println();








        ///with normal loop
/*

for (int i=0;i<arr.length;i++){
   for (int j=0;j<arr[i].length;j++){
       sum=+arr[i][j];
       System.out.println(arr[i][j]);


   }System.out.println(sum);
*/


}
    }
