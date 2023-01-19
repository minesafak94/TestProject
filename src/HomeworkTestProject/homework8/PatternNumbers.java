package HomeworkTestProject.homework8;

public class PatternNumbers {
    public static void main(String[] args) {

        /*5) Print the following pattern:
55555
4444
333
22
1
       */

        for (int i=5;i>=4;i--){
            for (int j=i;j>=1;j--){

                System.out.print(i+" ");

            }
            System.out.println();
        }
    }
}
