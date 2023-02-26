package class29;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        //store objects of dog class inside of arrayList

        Dog d1=new Dog("Jacky","Persian",15);

        ArrayList<Dog>dogs=new ArrayList<>();
        //dogs.add(d1); or
        dogs.add(new Dog("Jacky","Persian",15));
        dogs.add(new Dog("Jimmy","Kangal",12));
        dogs.add(new Dog("Jinny","Bulldog",5));
        dogs.add(new Dog("Mami","Unknown",10));

        for (Dog d:dogs){
            d.printDogName();
        }




    }
}
