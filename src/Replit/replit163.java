package Replit;



    class Main {

        void hello(){
            System.out.println("method in Parent class");

        }}

    class Child1 extends Main {

        void hello(){
            System.out.println("method in Child1 class");
        }
    }

    class Child2 extends Main {
        void hello(){
            System.out.println("method in Child2 class");
        }
    }

    class Child3 extends Main {
        void hello(){
            System.out.println("method in Child3 class");
        }
    }

    class Test {
        public static void main (String[]args){
            Child1 c=new Child1();
            c.hello();

            Child2 c2=new Child2();
            c2.hello();

            Child3 c3=new Child3();
            c3.hello();
        }
    }

