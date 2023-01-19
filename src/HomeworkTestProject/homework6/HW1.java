package HomeworkTestProject.homework6;

public class HW1 {
    /*1)Create a boolean variable workDay and assign true create int variable day and assign it to 1
    As long as it is workDay print “I need a day off” and increase day.
    Once day is 6 print “I do not need a day off any more”*/


    public static void main (String[] args){
    boolean workDay=true;
    int day=1;
    while (workDay){
        if (day<6){
            System.out.println("I need a day off");}
            else if(day==6) {
                System.out.println("I dont need a day off anymore");
            }else if(day>6){
             workDay=false;
            }day++;
       }
    }
    }
