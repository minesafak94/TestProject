package class11.homework11.D2Arrays;

public class fourth {
    public static void main(String[] args) {
//4)Create a 2D array or integer type and store
// numbers in 3 rows and 3 columns. Print the sum of all numbers.

       int [][]numbers= {{1, 2, 3},
               {5, 4, 8},
               {8, 9, 7},
       };

int sum=0;
        for (int i=0;i< numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                System.out.print(numbers[i][j]+" ");
                sum+=numbers[i][j];

            }System.out.println();
        }System.out.println("The sum of all numbers: "+sum);
    }
}
