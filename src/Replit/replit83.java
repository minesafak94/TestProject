package Replit;

public class replit83 {
    public static void main(String[] args) {


        {
            int[][] a = {
                    {1,1,2}, //sum = 4
                    {3,1,2}, //sum = 6
                    {3,5,3}, //sum = 11
                    {0,1,2}  //sum = 3
            };

            int sum1=0;
            int sum2=0;
            int sum3=0;
            int sum4=0;


            for (int i=0;i<1;i++){

                for (int j=0;j<a[i].length;j++){
                    sum1+=a[0][j];
                    sum2+=a[1][j];
                    sum3+=a[2][j];
                    sum4+=a[3][j];

                }

            } System.out.println(sum1);
            System.out.println(sum2);
            System.out.println(sum3);
            System.out.println(sum4);

        }

    }
}

