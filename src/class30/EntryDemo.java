package class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class EntryDemo {

    public static void main(String[] args) {
        Set<Entry> entrySet=new LinkedHashSet<>();
//entrySet contains the objects of the Entry class (with new linkedhashset)
        entrySet.add(new Entry(1,"Nezir"));
        entrySet.add(new Entry(2,"Shah"));
        entrySet.add(new Entry(3,"Tami"));
        entrySet.add(new Entry(4,"Aisha"));
        entrySet.add(new Entry(5,"Gul"));
        entrySet.add(new Entry(6,"Bahar"));
        entrySet.add(new Entry(7,"Saba"));

        Entry entry=new Entry(1,"Mine");
        System.out.println(entry.getKey()+" "+entry.getValue());

        //with opt and mouse you can change all line values at once

//remove those objects for which value of key is greater than 2 and value contains the letter i

        entrySet.removeIf(x->x.getKey()>2&&x.getValue().contains("i"));
        System.out.println(entrySet);
    }
}
