package Replit;

public class replit133 {
        public static int countA(String s) {
            int countA = 0;
            for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i)==('a')||s.charAt(i)==('A')) {
                        countA++;

                    }


            }
            return countA;


        }


        //test case below (don't change):
        public static void main(String[] args){
            System.out.println(countA("aaA")); //3
            System.out.println(countA("aaBBdf8k3AAadnklA")); //6
        }
    }

