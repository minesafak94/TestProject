package class15.homework;

import java.util.Scanner;

public class Task4 {
    //4)Create a method that will say Hello in different language based on the country that will passed when method is executed

    String countries(String country){

    switch (country.toLowerCase()) {

        case "usa":
            return "Hello";
        case "india":
            return "हेलो";
        case "russia":
            return "Привет";
        case "france":
            return "Salut";
        case "germany":
            return "Hallo";
        case "turkey":
            return "Merhaba";
        case "israel":
            return "שלום";
        case "china":
            return "你好";
        case "japan":
            return "こんにちは";
        case "thailand":
            return "สวัสดี";
        default:
            return "False input!";


 
}}

    public static void main(String[] args) {

        Task4 task4=new Task4();


        System.out.println(task4.countries("turkey"));
    }




}
