package class15;

public class MethodPractice2 {
    //crate a method that takes a String reverse it and return the reversed String
//call method reverseStr

    String reverseStr(String input) {
        String newStr = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            newStr += input.charAt(i);
        }

        return newStr;
    }


    String reverseStr1(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    String reverseStr2(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}























    /*String reverseStr(String input){
        String newStr="";
        for (int i=input.length();i>0;i--) {
          newStr+=input.charAt(i);

        } return newStr;}}


    String reverseStr(String input){
        String newStr="";
        for (int i =input.length()-1 ; i>=0 ; i--) {
            newStr+=input.charAt(i);
        }

        return newStr;
    }


    String reverseStr1(String input){
        return new StringBuilder(input).reverse().toString();
    }

    String reverseStr2(String input){
        StringBuilder stringBuilder=new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }


//you can use string builder instead of for loops

*//*
    String reverseStr1(String input){
    return new StringBuilder(input).reverse().toString();
}


String reverseStr2
*//*

//logic of reversing
*//*
String str="Sunday";
for (int i=str.length-1;i>0;i--){
    System.out.print(str.charAt(i));
        }*//*
*/