package class10;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {
// a 2D Array which can hold 3 one D arrays
        //each of size 3
        String [][] thomsonTrain=new String[3][3];

        String []cabin0={"Adam","Zafar","Sam"};
        String []cabin1={"Adami","Zafari","Sami"};
        String []cabin2={"Ada","Zafa","Sa"};

        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;
//in the first [] we specify the address of 1D Array
        System.out.println(thomsonTrain[1][2]);
        System.out.println(Arrays.toString(thomsonTrain[0]));
    }
}
