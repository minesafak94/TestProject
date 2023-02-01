package class14;

import java.lang.reflect.Method;

public class MethodTester2 {
    public static void main(String[] args) {

//creating an object of the class
        MethodsDemo2 md=new MethodsDemo2();
       // md.printHello();//calling a method


        /*md.printHelloManyTimes(10);*///wenn du in MethodsDemo2 nach printHelloManyTimes(int "times") eingegeben hast
        //kannst du ganz einfach im Tester nach dem Namen die Zahl einfuege

        md.printManyTimes(5,"I love Java");
    }
}