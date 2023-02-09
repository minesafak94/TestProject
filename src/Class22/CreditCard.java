package Class22;

public class CreditCard {
    /*Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.

    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/

    double balance;
    double interest;

    void calc(double balance,double interest){

        System.out.println(balance*interest);
    }}

    class AX extends CreditCard{
        void calc(double balance,double interest){

            System.out.println(balance*interest+1);
        }
    }

    class Visa extends CreditCard{}

        class Tester {
    public static void main(String[] args) {

    CreditCard c=new CreditCard();
    c.calc(5,3);

    Visa v=new Visa();
    v.calc(32,2);

        AX a=new AX();
        a.calc(2,3);
    }
    }