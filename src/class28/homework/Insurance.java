package class28.homework;


import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {

        /*6) Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote
        and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and
        Class Pet has petType attribute.

        Create 3 objects of the sub classes and store them in ArrayList.
        Using for loop/advanced for loop/ iterator access all methods of the class.
        Create a Card class that will have interest rate field and card type
          and a constructor that will initialize the fields.
          Create 3 objects of different card and store them into LinkedList.
          Using for loop/advanced for loop/ iterator access all methods of the class.*/

        String insuranceName="StateFirm";

        abstract void getQuote();
        abstract void cancelInsurance();

    }

    class Car extends Insurance{
        @Override
        void getQuote() {
            System.out.println("car quote is: ");
        }

        @Override
        void cancelInsurance() {
            System.out.println("cancel car Insurance");
        }

        String carModel="Mercedes";
    }


    class Pet extends Insurance{
        @Override
        void getQuote() {
            System.out.println("quote is");

        }

        @Override
        void cancelInsurance() {
            System.out.println("cancel car Insurance");

        }

        String petType="Golden Retriever";

    }

    class Health extends Insurance{
        @Override
        void getQuote() {
            System.out.println("quote is");

        }

        @Override
        void cancelInsurance() {
            System.out.println("cancel car Insurance");

        }
    }

    class Tester{

        public static void main(String[] args) {

            Car carInsurance=new Car();
            Pet p=new Pet();
            Health h=new Health();

            ArrayList<Insurance>arrays=new ArrayList<>();


            arrays.add(carInsurance);
            arrays.add(p);
            arrays.add(h);



            //   Using for loop/advanced for loop/ iterator access all methods of the class.


            for (int i=0; i<arrays.size();i++){
                System.out.println(arrays.get(i));
            }


            //___________________________________________________

                for (Insurance in: arrays){
                in.getQuote();
                in.cancelInsurance();

            }

                //__________________________________

            Iterator <Insurance>i=arrays.iterator();
            while(i.hasNext()){
                System.out.println(i.next());

            }
        }
    }