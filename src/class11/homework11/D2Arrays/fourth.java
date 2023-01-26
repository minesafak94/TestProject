package class11.homework11.D2Arrays;

public class fourth {
    public static void main(String[] args) {
//4)Create a 2D array or integer type and store
// numbers in 3 rows and 3 columns. Print the sum of all numbers.

       int [][]numbers= {{1, 2, 3},
               {5, 4, 8},
               {8, 9, 7},
       };


        for (int i=0;i<=2;i++){
            for (int j=0;j<=2;j++){
                System.out.println(numbers[j][i]);
            }
        }
    }
}
