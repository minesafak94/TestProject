package class8;

public class NestedLoops5 {
    public static void main(String[] args) {

        for (int i=0;i<3;i++){



                if (i==1){// this block is for skipping
                    System.out.println();
                  continue;
                }

            for (int j=0;j<5;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
