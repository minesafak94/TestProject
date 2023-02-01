package class15;

import java.lang.reflect.Method;

public class MethodPracticeTester {
    public static void main(String[] args) {

        MethodPractice mp=new MethodPractice();
        boolean isEven=mp.isEven(13);
//um auf die Method zugreifen zu koennen,musst du zunaechst new create

        boolean isEven1=mp.isEven(100);
        boolean isEven2=mp.isEven(12);
        boolean isEven3=mp.isEven(20);

        System.out.println(isEven);
        System.out.println(isEven1);
        System.out.println(isEven2);
        System.out.println(isEven3);

        //you can do it like this as well but it's just for printing out

        System.out.println(mp.isEven(17));
        }
    }
