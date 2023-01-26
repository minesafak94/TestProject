package class11.homework11.D2Arrays;

public class first {
    public static void main(String[] args) {
        //1)Create a 2D array(shorter way) in which first array will
        // consist of 4 names and second array will contain grades. Then your
        //program should print name of the students that has A and B grade

        String [][] nameGrade={{"Daniel","Luigi","Maria","Sonja"},
            {"A","B","C","D","F"}
        };

        for (int i=0;i<=nameGrade.length;i++){
            for (int j=0;j<=nameGrade.length;j++){
                if (nameGrade[i][j].equals("A") || nameGrade[i][j].equals("B")) {
                    System.out.println(nameGrade[i][j]+" "+nameGrade[i][j]);
}
                System.out.println();
            }
        }
    }
}
