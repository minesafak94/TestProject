package class4;

public class IfElseIfConditionsDemo3 {
    public static void main(String[] args) {

        int day=10;//to assign a value to a variable =

        if (day==1) {//== we compare two values / if block
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");// else block
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("Saturday");
        }else if(day==7){
            System.out.println("Sunday");
        }else {
            System.out.println("Please enter a day between 1 and 7");//else nur dann wenn du auch wenn nichts kommt etwas
            //ausgegeben haben moechtest und es kommt immer ganz am Ende, dh wenn nichts funktioniert nur dann!!!
        }
    }
}
