package Replit;

import static java.lang.String.valueOf;

public class repo {

String news;

    void censorLetter(String str,char c) {

        for (int i = 0; i <str.length(); i++){

            if (str.charAt(i) ==c) {
                news=str.replace(str.charAt(i), '*');


            }
        }System.out.println(news);}


    public static void main (String[]args){

        repo main=new repo();
        main.censorLetter("computer science", 'e');
        main.censorLetter("trick or treat",'t');
    }


}
