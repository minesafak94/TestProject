package class13.Homework;

public class Task3 {
    public static void main(String[] args) {
        //3) You have a String a=”Is it saturday?
        // Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?

        String a="Is it Saturdays? It raining? Do we have a Java Class today?";

        System.out.println(a.split("[?]").length);



    }
}
