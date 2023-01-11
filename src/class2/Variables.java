package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        below line is reserving a box in the memory of the computer
        we are calling it box1, if we need the information hat we are storing inside this box
        we can simply say to the computer: give us the content of box1
        int=> what type of data we want to store
        box1=> is the name of the box
        = sign will take whatever we write after it and will store it inside the box1
        10=> is what we are storing inside the box
        */
         int box1=10;
         //if we are printing sth from a box we don't need ""
        System.out.println(box1); //bring the contents of box1 and print them on the console
        /*
        wenn du "etwas zwischen diese Gaensefuesschen setzt, dann denkt dein PC es soll TEXT ausgegeben werden! "
        ohne die  "" wird es den Inhalt reinsetzen, in diesem Fall die 10
        */
        /*to store whole numbers without decimal points, we have 4 different types of boxes
        for example numbers like 10 200 2405 034 834 3 23 ...
        1)byte 2)short 3)int 4)long
         */
        byte box2=127;
        byte box3=-128;//range byte is between -128 and 127
        short box4=32767;
        short box5=3256;
        int biggerBox=123456484;//most common type of box
        long maxBox=1513225432l;
        short myBox=10000;
        System.out.println(myBox);




    }
}
