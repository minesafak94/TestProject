package class10;

public class ArrayDemo {
    public static void main(String[] args) {

        int[]arr={10,20,30,40,50};
        System.out.println(arr[4]);
        //print two numbers from the array
        System.out.println(arr[1]+" "+arr[4]);
//print all the elements from this array using a loop
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


        System.out.println("&&&&&&&&&&&&&&&&&&&&&");


        //enhanced for loop --->>>> only for arrays at the moment!!!
        // when ever possible use loop below
        for(int number: arr){
            System.out.println(number);
        }

    }
}
