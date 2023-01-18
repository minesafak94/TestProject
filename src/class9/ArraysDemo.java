package class9;

public class ArraysDemo {
    public static void main(String[] args) {

        String name2="Hanafe";
        String [] name={"Slava","Mine","Asli"};

        System.out.println(name2);
        System.out.println(name[2]);
        System.out.println(name[0]);
        System.out.println(name[1]);
        //System.out.println(name[100]); error because there is no name on index 100
        //System.out.println(name[-5]); error minimum is 0 cant be negative anyway

for (int i=0;i<=2;i++){
    System.out.println(name[i]);
}







    }
}
