package Replit;

public class StringCharRead {


    public static int countA(String s) {
        int countA = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); i++) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                    countA++;
                }

            }

        }

        return countA;
    }





    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}