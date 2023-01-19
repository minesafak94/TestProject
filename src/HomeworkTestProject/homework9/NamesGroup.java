package HomeworkTestProject.homework9;

public class NamesGroup {
    public static void main(String[] args) {

        //2) Create an array of names and store all names of your group.
        // Then print your name from that array. (use 2 different ways of creating an array).

        String [] names={"Joe","Tenoar","Granger","Ninja","Renold"};
        System.out.println(names[4]);

        // 2nd way
        String [] names1=new String[5];

        names1[0]="Joe";
        names1[1]="Toni";
        names1[2]="lore";
        names1[3]="Gine";
        names1[4]="Joel";

        System.out.println(names1[3]);


    }
}
