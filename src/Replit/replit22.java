package Replit;

public class replit22 {
    public static void main(String[] args) {
        {
            int[][] a = {
                    {-5, -2, -3, 7},
                    {1, -5, -2, 2},
                    {1, -2, 3, -4}
            };

            int sum = 0;

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (i % 2 == 0 && j % 2 == 0) {
                        a[i][j] = j + 1;
                    }
                }
                System.out.println(a.length);
                System.out.println(a[0].length);
           /*
                    if (a[i].length % 2 == 0&& a[j].length%2==0 ) {
                        sum+=a[i][j];
                    }

                    //     sum+=a[i][j];

                }System.out.println(sum);
            }*/


            }
        }
    }

}