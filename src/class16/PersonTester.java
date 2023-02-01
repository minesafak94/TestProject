package class16;

import java.util.Scanner;

public class PersonTester {

    public static void main(String[] args) {
        Person person=new Person();


        System.out.println(person.Address);
        //System.out.println(person.bankBalance);//this is private, cant access class
        System.out.println(person.name);

        person.printSSN();
        person.printTikTokAccount();
       // person.printPassword();//program doesnt know printpassword exists

    }
}


