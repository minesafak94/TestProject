package class27;

public class Demo2 {
    public static void main(String[] args) {


        String name = "Nima";
        String[] names = {"Hiral", "Nima", "Laura", "Nat"};

        System.out.println(contains(name,names));

    }

    public static boolean contains(String nameTobeSearched, String[] names){


    for (String name:names){
        if (nameTobeSearched.equals(name)){//equals with the name variable, because we did store our array in there
            return true;
        }
        }


        return false;
    }}