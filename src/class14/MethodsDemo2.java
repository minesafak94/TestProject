package class14;

import java.util.Scanner;

public class MethodsDemo2 {
//whenever void is called there is no output->no assignment

    //name of the method after void then ()
    void printHello() {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

    }
        void  printHelloManyTimes(int times){
            for (int i=0;i<times;i++){

            System.out.println("Hello World");
        }
    }
    //du kannst einfach ein Komma einfuegen und mehrere Variablen einfuegen
    void printManyTimes (int times,String word){
        for (int i=0;i<times;i++){
            System.out.println(word);
        }
    }


    }