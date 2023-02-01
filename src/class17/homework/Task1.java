package class17.homework;

public class Task1 {
    //1) Write a java class that will have a constructor:
    // one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.

    String brand;

    String color;

    String savingSpace;


    Task1 (String pbrand,String pcolor,String psavingSpace) {

        brand = pbrand;
        color = pcolor;
        savingSpace=psavingSpace;
    }

    void printInfo(){
        System.out.println(brand+" "+color+" "+savingSpace);
    }

}
