package class9;

public class ArraysDemo3 {
    public static void main(String[] args) {

        //Create an array to store the letters A B c d e F

        char [] various={'A','B','c','d','e','F'};

        various[0]='z';// u can update elements

        for (int i=0; i<various.length;i++){
            System.out.println(various[i]);
        }
    }
}
