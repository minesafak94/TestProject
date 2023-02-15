package Replit;

public class replit134 {
    public static int countVowels(String s) {
        int countA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i)==('a')||s.charAt(i)==('e')||s.charAt(i)==('i')||s.charAt(i)==('o')||s.charAt(i)==('u')) {
                countA++;
            }
        }
        return countA;
    }



    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}


