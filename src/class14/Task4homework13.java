package class14;

public class Task4homework13 {
    public static void main(String[] args) {

/*
        4) How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever*/



// with StringBuilder class below
        //we created stringbuilder object
       /* StringBuilder st=new StringBuilder("This is the sentence i want to reverse");
       //we did reverse here
        System.out.println(st.reverse());

        String str=st.toString();*///we have to change from builder to string to use reverse method
        //we convert this stringBuilder just for using method from string

      /*  for (String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.println(st);
            System.out.println(" ");
        }


        for (String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.println(st);
            System.out.println(" ");
        }*/

//__________________________
        //we use String class

       /* String str="This is sentence i want to reverse";
        String[]arr=str.split(" ");
        //calling split gives out an array


        for (String word: arr) {//enhanced for loop:first data type which are in that array+word=arr
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
                ;
            }
            System.out.println(" ");
        }
//___________________
*/
        String str1="This is sentence i want to reverse";
        String[]arr=str1.split(" ");
        //calling split gives out an array
        for (String word:arr){
            System.out.print(new StringBuilder(word).reverse()+" ");
        }}}
  /*      //___________________________
String word="This";
for (int i=word.length()-1;i>=0;i--){
    System.out.print(word.charAt(i));
}//output reverset This ->> sihT


    }
}
*/