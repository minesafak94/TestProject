package class11.homework11.D2Arrays;

public class sixth {
    public static void main(String[] args) {
//6)Create 2D array of countries: north america
// countries, south america countries, europe countries,
// asian countries, african countries.
//Then print all values from that array using 2 different
// loops and calculate how many total countries been stored


        String[][] countries =
                {{"Kanada", "USA", "Mexico"},
                {"Chile", "Argentina", "Brasil"},
                {"Germany", "Netherlands"},
                {"China", "Japan", "Korea"},
                {"Ghana", "Mosambik", "Burkina Faso", "Ruanda"}};

        for (int i = 0; i < countries.length; i++) {

            for (int j = 0; j<3; j++){
                System.out.println(countries[i][j]);
            //  System.out.println(Arrays.deepToString(countries)); just for seeing the inputs
        }

            System.out.println();
        }
    }}