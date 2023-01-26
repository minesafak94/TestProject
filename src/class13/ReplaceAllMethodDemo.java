package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {

        String str="  kKDJFKSkdkkfj3342342%$$#%";
// replace All upper case letters from A-Z
        System.out.println(str.replaceAll("[A-K]","#"));
        // replaces All lower case letters from a-z
        System.out.println(str.replaceAll("[a-z]","#"));
        // replaces All digits from 0-9
        System.out.println(str.replaceAll("[0-9]","#"));
        // replaces All lower case letters from a-z All upper case letters from A-z and all digits from 0-9
        // with ^ means => not replace All lower case letters from a-z All upper case letters from A-z and all digits from 0-9
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));//   ^ => dont replace this


        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));// with "" they will be removed





    }
}
