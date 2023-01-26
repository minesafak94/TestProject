package class11.homework11.D2Arrays;

public class second {
    public static void main(String[] args) {
        //2) Create 2D array of cars :
        // american, german, korean, italian. Then retrieve all values from that array using 2 different loops

        String[][] car={{"Mercedes","Audi","BMW"},
                        {"Toyota","Subaru"},
                        {"Fiat","Ferrari"}
        };

        for (int i=0;i<1;i++){
            for(int j=0;j<car.length;j++)
            System.out.print(car[0][j]+" ");
            }

        for (int i=1;i<=2;i++){
            for(int j=0;j<=1;j++){
                System.out.print(car[i][j]+" ");
        }


            /*for (int a=0;a<=2;a++){
                for (int j=0;j<=1;j++){
                    System.out.println(car[a][j]);
                }
            }
*/
        }
    }}

