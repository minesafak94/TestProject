package class28.homework;


import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {
//this is stored in class 29 task4 in Asghars folder
        /*6) Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote
        and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and
        Class Pet has petType attribute.

        Create 3 objects of the sub classes and store them in ArrayList.
        Using for loop/advanced for loop/ iterator access all methods of the class.
        Create a Card class that will have interest rate field and card type
          and a constructor that will initialize the fields.
          Create 3 objects of different card and store them into LinkedList.
          Using for loop/advanced for loop/ iterator access all methods of the class.*/

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    String insuranceName;

        abstract void getQuote();
        abstract void cancelInsurance();

    }

    class Car extends Insurance{
        public Car(String insuranceName, String carModel) {
            super(insuranceName);
            this.carModel = carModel;
        }

        @Override
        void getQuote() {
            System.out.println("car quote is: ");
        }

        @Override
        void cancelInsurance() {
            System.out.println("cancel car Insurance");
        }

        String carModel;
    }


    class Pet extends Insurance{
        public Pet(String insuranceName, String petType) {
            super(insuranceName);
            this.petType = petType;
        }

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
        public Health(String insuranceName) {
            super(insuranceName);
        }

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



            ArrayList<Insurance>arrays=new ArrayList<>();
            arrays.add(new Car("Geico","BMW"));
            arrays.add(new Pet("Retro","Retriever"));
            arrays.add(new Health("Statefirm"));




            //___________________________________________________

                for (Insurance in: arrays){
                in.getQuote();
                in.cancelInsurance();

            }

                //__________________________________

            }
        }
