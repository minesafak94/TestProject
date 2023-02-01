package class11.homework11.D2Arrays;

public class fifth {
    public static void main(String[] args) {
//5)Create a 2D array or integer type where
// you will store odd and even numbers in 3 rows
// and 4 columns. Develop a program which
//will identify/print the even numbers only.

        int [][] numbers= {{1, 2, 3,8},
                {5, 4, 8,5},
                {8, 9, 7,4},
        };

        for (int i=0;i<numbers.length;i++){
            for (int j=0;j< numbers[i].length;j++){
                if (numbers[i][j]%2==0){
                    System.out.println(numbers[i][j]);
                }}
                System.out.println();
            }
        }
    }

