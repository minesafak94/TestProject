package class3;

public class IfElse_9 {
    public static void main(String[] args) {

        char c='f';

        if (c=='M') {

            System.out.println("Male");// nothing is printed out f is not M, no print of false

    }

        String name="Nat";
        //with non-primitive data types such as String we can't use == symbol
        if(name.equals("Sam")) {
            System.out.println("Amazing student");
        }
            if(!name.equals("Sam")){//! means not can change result from true to false and in reverse
                System.out.println("Super amazing student");
        }


    }
}
