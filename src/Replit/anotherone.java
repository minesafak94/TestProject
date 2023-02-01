package Replit;

public class anotherone {
    String carColor;
    int year;
    String brand;







    public static void main (String[]args){

        anotherone BMW=new anotherone();

        BMW.brand="BMW";
        BMW.carColor="Black";
        BMW.year=2019;

        anotherone Toyota=new anotherone();

        Toyota.brand="Toyota";
        Toyota.carColor="White";
        Toyota.year=2018;

        System.out.println("Car color is "+ BMW.carColor+ " and car year is "+BMW.year+ " and car model is "+BMW.brand);
        System.out.println("Car color is "+ Toyota.carColor+ " and car year is "+Toyota.year+ " and car model is "+Toyota.brand);



    }
}
