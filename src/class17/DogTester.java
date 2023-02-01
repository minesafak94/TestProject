package class17;

public class DogTester {



    public static void main(String[] args) {

        Dog dog1=new Dog("SnowWhite","Husky", "blue",23,34.3);
       /* dog1.name="SnowWhite";
        dog1.breed="Husky";
        dog1.color="blue";
        dog1.age=23;
        dog1.weight=34.3;*///das kann ganz ersetzt werden mit der Zeile da oben!!!


        Dog dog2=new Dog("Leon","Schaefer", "orange", 23,14);
        dog2.printInfo();
        Dog dog3=new Dog("Wiwi","bulldog", "grey", 11,20.4);
        dog3.printInfo();
        Dog dog4=new Dog("Jack","Schaefer", "black",12,23.5);
        dog4.printInfo();
        Dog dog5=new Dog ("Pupu","Poodle","brown",2,7.5);
        dog5.printInfo();


    }
}
