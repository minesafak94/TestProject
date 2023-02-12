package Replit;

public class Stringbuilder3rdLetter {

    public static String thirdLetter(String s) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 3) {
            sb.append(s.charAt(i));
        }
        return sb.toString();}

        //test case below (dont change):
        public static void main (String[]args){
            System.out.println(thirdLetter("hello there")); //"hltr"
            System.out.println(thirdLetter("technology")); //"thly"
        }

}
