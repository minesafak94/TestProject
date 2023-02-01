package class15.homework;

public class Task3 {

    //3) Create a method that will print whether given String is palindrome or not.

    //return type=> void
    //name=>isPalindrome
    //parameters=> String inputStr

    String Palindrome(String str){
        String revStr="";

        for (int j = str.length()-1; j >= 0; j--) {
            revStr = revStr + str.charAt(j);

            if (str.toLowerCase().equals(revStr.toLowerCase())) {

                return str + " is Palindrome";
            }
        }
        return " is not Palindrome";
    }


    public static void main(String[] args) {

        String str="dad";

        StringBuilder st=new StringBuilder(str);

        //objectname = st //methodname =reverse
        st.reverse();//this will return anything you put in StringBuilder("buraya")
        String reversedStr=st.toString();
        if (str.equals(reversedStr)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" isn't palindrome");
        }


}}



/*with Asghar
*
* void isPalindrome (String str){
*
*   StringBuilder st=new StringBuilder(str);

        //objectname = st //methodname =reverse
        st.reverse();//this will return anything you put in StringBuilder("buraya")
        String reversedStr=st.toString();
        if (str.equals(reversedStr)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" isn't palindrome");
        }
        *

       *
       * public static void main(String[] args){
       *
       * Task3 task3=new Task3();
       *task3.ispalindrome("kaya");
       *task3.isPalindrome("Kaya");//das ruft die Methode isPalindrome auf

 */