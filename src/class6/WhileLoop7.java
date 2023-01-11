package class6;

public class WhileLoop7 {
    public static void main (String[]args) {
/*
       *//*  Print below sequence loop
                1234 6789 11 12 13 14 16*//*

        int number = 1;
        while (number < 16) {
            if (number == 5 || number == 10 || number == 15) { //wenn diese Zahlen gib nichts raus
//deshalb ist hier leer!!!
            } else {
                System.out.println(number);

            }
            number++;


        }*/
        System.out.println("***************************************");

        int number2=1;
        while (number2<=16){

            if (number2%5==0) {   // or number2%5!==0, dabei werden 5, 10, 15 nicht gedruckt!!!
                //dont doo anything, if {   empty in here   }
            }else{

            System.out.println(number2);
        }number2++;

    }}}

