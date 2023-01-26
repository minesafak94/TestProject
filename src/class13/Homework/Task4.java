package class13.Homework;

public class Task4 {
    public static void main(String[] args) {
        //4) How would you reverse a String word by word? for example
        //        // input=>This is sentence i want to reverse
        //        // output=>sihT si ecnetnes i tnaw ot esrever
        String rev="This is sentence i want to reverse";


        for (int i=rev.length()-1;i>=0;i--){

            System.out.print(rev.charAt(i));

        }
        System.out.println();



        /*We can reverse each word of a string by the help of reverse(),
        split() and substring() methods. By using reverse() method of StringBuilder class,
        we can reverse given string. By the help of split("\\s") method, we can get all words in an array.
        To get the first character, we can use substring() or charAt() method.*/

    }
}
