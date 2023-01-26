package class13;

public class StringVsStringBuilder {
    public static void main(String[] args) {
       /* String str="";
        for (int i=0;i<1000;i++){
            str=str+i;//hier checkt dein Code 1000 mal alles ab um str um 1 zu ergaenzen
            //memory will be scanned, new value will created and will scan again and again!!!--> why String? use StringBuilder
        }*/

        //nutze hier Stringbuilder
        //string inside a loop or many changes use StringBuilder

        StringBuilder str=new StringBuilder();
        for (int i =0;i<1000;i++){
            str.append(i);//StringBuilder ist schneller!!!
        }
    }
}
