package class9.homework9;

public class Cars {
    public static void main(String[] args) {

     //   4) Create an array that can store names of cars and store 6 elements into it.
        //   Print all values from the array.

        String [] car={"BMW","Mercedes","Audi","Porsche","Tesla","Toyota",};

        for (int i=0;i<1;i++){
            for (int j=0;j<6;j++)
            System.out.println(car[j]);
        }
        System.out.println();
     //   System.out.println(Arrays.toString(car));
/*      System.out.println(Arrays.toString(gfg));
        //oder wenn mehrere Arrays
        //-->
      String gfg[][]
                = { { "GeeksforGeeks", "Article Writing" },
                { "Google", "Search Engine" },
                { "Facebook", "Social Media" } };
        System.out.println(Arrays.deepToString(gfg));*/
    }
}
