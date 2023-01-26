package Project;

public class Task4 {
    public static void main(String[] args) {
        //4) Create a 2D array or integer type
        // where you will store odd and even numbers. Develop a program which will identify/print the even numbers only.

        int [][] arr={{22,24,28},{33,31},{34,37,48}};


        int r=0;
        for(int i=0;i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
            if (arr[i][j]%2==0){
                System.out.println(arr[i][j]);
            }else
                System.out.println();}
            }
            System.out.println();
        }
    }

