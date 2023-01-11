package class5;

public class LogicalOperators1 {
    public static void main (String [] args){

        System.out.println(true||true);
        // if you give me two true outputs I will work with it
        System.out.println(true||false);
        //its never false, if anywhere is just one true
        System.out.println(false||false);


        System.out.println(false||true|false|false);
        //always true, if one true is containing

        boolean boughtCho=false;
        boolean boughtFlowers=false;
        if (boughtCho||boughtFlowers){
            System.out.println(" I am happy");
        }else{
            System.out.println(" I am sad");
        }

        boolean wifi=true;
        boolean fiveG=true;

        if (wifi||fiveG)
        {
            System.out.println("You are good for surfing!");
        }else{
            System.out.println("Connect to Internet");
        }
    }
}
