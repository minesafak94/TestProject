package Class20.homework;

import java.awt.geom.Area;

class ShapeClass {

    /*1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
         In circle class create a method to calculate the area of circle. Test your code
     */

    int rad;

    ShapeClass(int rad) {
        this.rad = rad;
    }
}



    class Circle extends ShapeClass{
        double area;
        Circle(int rad){
            super(rad);
            area= (rad*rad)*Math.PI;
            System.out.println("The area of the circle is: "+area);
    }

    }

    class Test {


    public static void main(String[] args) {
        Circle areas=new Circle(5);

    }
}