package class13.Homework;

public class Task4 {
    public static void main(String[] args) {
        //4) How would you reverse a String word by word? for example
        //        // input=>This is sentence i want to reverse
        //        // output=>sihT si ecnetnes i tnaw ot esrever

        String str1="This is sentence i want to reverse";
        String[]arr=str1.split(" ");
        //calling split gives out an array
        for (String word:arr){
            System.out.print(new StringBuilder(word).reverse()+" ");
        }}}

