package class8;

public class Examples {
    public static void main(String[] args) {

       /* 0 1 2 3 4 5
        1 2 3 4 5
        2 3 4 5*/

       /* for (int i=0;i<1;i++){

            for (int a=0;a<=5;a++) {
                System.out.print(a);
            }
            System.out.println();
            for (int b=1;b<=5;b++) {
                System.out.print(b);
            }
            System.out.println();
            for (int c=2;c<=5;c++) {
                System.out.print(c);

            }
            System.out.println();
        }*/


        /*//Korrektur
        for (int i=0; i<5;i++){
            for (int j=i; j<=5;j++){
            System.out.print(j+" ");
        }
        System.out.println();*/


        /*
        0 1 2 3 4 5
        0 2 4 6 8 10
        0 3 6 9 12 15

        */

/*
        //denedim olmadi sanirim
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 0; j <= 10; j += 2) {
            System.out.print(j + " ");

        }
        System.out.println();
        for (int k = 0; k <= 15; k += 3) {
            System.out.print(k + " ");
        }
*/

//Korrektur
        /*for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print(2*i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print(3*i + " ");

        }*/

        //das wird jetzt in nested loops umgewandelt
 /*
        0 1 2 3 4 5
        0 2 4 6 8 10
        0 3 6 9 12 15

        */
        for (int i=1; i<=3;i++){
           for (int j=0;j<=5;j++){
               System.out.print(i*j+" ");
           }
            System.out.println();
        }
    }}



