package class11.homework11.D2Arrays;

public class third {
    public static void main(String[] args) {
//3) Using 2D array create a grocery list.
// Inside you should have an array of veggies, fruits, dairy and sweets.
// Retrieve all values from that array using 2 different loops

        String [][] groceryList= {{"cucumber", "Jicama", "Kale"},
                                  {"banana","orange"},
                                  {"sour cream","milk"},
                                  {"Haribo","Raffaelo"}

    };

        for (int i=0;i<=4;i++){
            for (int j=0;j<=3;j++){
                System.out.println(groceryList[j][i]+" ");
            }

        }


}}
