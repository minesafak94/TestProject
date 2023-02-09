package Class21;

public class calculateArea {


    void calculateArea(int a, int b){
        System.out.println(a*b);
    }

    void calculateArea(int a){
        System.out.println(a*a);
    }

    public static void main(String[] args) {
    calculateArea main=new  calculateArea();
    main.calculateArea(5);
    main.calculateArea(4,3);
    }

}
