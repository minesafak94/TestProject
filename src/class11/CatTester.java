package class11;

public class CatTester {
    public static void main(String[] args) {
// creating an object from the Cat class
        //the real cat is been forming here
        Cat cat1=new Cat();

        cat1.name="lego";
        cat1.breed="Van Cat";
        cat1.age=2;
        cat1.colour="Grey";
        cat1.attitude=false;
        cat1.eat();//takes from class Cat from function void eat sout{}


        Cat cat2=new Cat();

        cat2.name="loki";
        cat2.breed="domestic";
        cat2.age=4;
        cat2.colour="white";
        cat2.attitude=true;

        System.out.println(cat2.breed);//zieht die neu assigned Inhalte ins sout
        cat2.speak();//fungiert als sout



    }
}
