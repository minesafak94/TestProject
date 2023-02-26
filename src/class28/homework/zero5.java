package class28.homework;

import java.util.ArrayList;

public class zero5 {
    public static void main(String[] args) {
        /*5)Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
         */

        ArrayList<Integer>num=new ArrayList<>();

        for (int i=2;i<=500;i+=2) {
            num.add(i);}//all even numbers are stored in num arraylist

        //we can use lamda expression as well as for loop again for the next part
        num.removeIf(x->x%5==0);

        //or for loop as mentioned, but this isnt safe

      /*  for (int i=0;i<num.size();i++) {
            if (num.get(i)%5 == 0) {
                num.remove(i);//only numbers not divisible with 5 are stored
            }
        }
*/
        System.out.println(num);
        }
    }

