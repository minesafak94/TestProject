package class4;

public class IfDemo_1 {
    public static void main(String[] args) {
        int money=15000;

        if(money>1000){
            System.out.println("Lets buy an Iphone");
        }
        if (money>2000){
            System.out.println("Lets also buy a MacBook");
        }

        boolean mothersDay=true;

        if (mothersDay){
            System.out.println("Happy Mother's day");
        }

        String name="Sardar";

        if(name.equals("Sardar")){ //if you write Sardar small you dont get any result because sardar isnt equal to Sardar!!!
                            //string and relational data types like == isnt working properly
            System.out.println("I love football");

        }
    }
}
