package class28;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String>word=new ArrayList<>();
        word.add("cat");
        word.add("java");
        word.add("computer");
        word.add("lava");

        for(String s:word){
           if(s.endsWith("a")){
               word.remove(s);
           }
        }
        System.out.println(word);
    }
}
