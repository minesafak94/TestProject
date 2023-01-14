package class8;

public class ContinueKeyworkDemo1 {
    public static void main(String[] args) {
/* wenn wir bestimmte Zahlen ueberspringen wollen, aber trotzdem alle Iterationen ausgegeben haben moechten */
        for (int i = 0; i <10; i++){
            if (i%3==0){
                continue;//skip
            }else{
                System.out.println(i);

            }System.out.println("Hello Java");

        }
    }
}
