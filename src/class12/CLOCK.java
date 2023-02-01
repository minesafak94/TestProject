package class12;

public class CLOCK {
    public static void main(String[] args) {
        for (int i=0;i<=23;i++){
            for (int j=0;j<=59;j++){
                if (j<=9||i<=9){
                    System.out.println("0"+i+" "+ ": 0"+j);
                }else{
                System.out.println(i+" :"+" "+j);
            }
    }
}}}
 /* for (int i=0;i<=23;i++){
          for (int j=0;j<=3;j++){
          for (int k=0;k<=5;k++){
          for (int l=0;l<=9;l++){
          System.out.println(i+" "+j+":"+k+" "+l);
          }
          }
          }}}}*/
