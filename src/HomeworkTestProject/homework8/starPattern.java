package HomeworkTestProject.homework8;

public class starPattern {
    public static void main(String[] args) {

        /*6) Print the following pattern:
         *

         *

         *
         **
         *
         **
         *
         */

        for (int i=1;i<=1;i++){
            for (int j=i;j<=10;j++){
                if (j==2||j==4){
                    System.out.println();
                }else if(j==6||j==8){
                    System.out.println("**");
                }else {
                    System.out.println("*");
                }
            }
        }

    }
}
