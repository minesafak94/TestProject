package class8;

public class BreakKeyword {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=75;
        while (summer){
            if(temp<=100){
                System.out.println("I love summer "+temp);
            }else{
                System.out.println("It's very hot");
                break;
            }
            temp+=5;
        }

    }
}
