package class13;

public class SplitMethodDemo {
    public static void main(String[] args) {

        String str="I like Java. I write a lot of code daily. I am from Batch 15.";

        String [] strArr=str.split("[.?!]");//mit dieser Anweisung teilst du String in einzelne Arrays, die du spaeter mit strArr[i] jeweils eine Zahl ausgegeben bekommst!

        System.out.println(strArr.length);
        System.out.println(strArr[2]);// allein mit dieser Anweisung erhaelst du Teile des Strings str

//___________ ab hier asghars code --- man kann das auch so machen!
        String str1="I like java. I write a lot of code daily. I am from batch 15.";
        String [] strArr1=str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());
        //whenever we are working with arrays we use the length and whenever we are working with Strings
        // we use the length()
    }
}
