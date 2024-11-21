package let_us_java;
import java.util.*;
public class RectangleArea_2 {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the length of the rectangle");
     double length=sc.nextDouble();
     System.out.println("Enter the breath of the rectangle");
     double breadth=sc.nextDouble();
     double area=length*breadth;
     System.out.println("Area of rectangle is:-"+area);
     double perimeter=2*(length+breadth);
     System.out.println("perimeter of rectangle is:-"+perimeter);
     System.out.println("Enter the value of radius");
     double radius=sc.nextDouble();
     double circleArea = Math.PI * radius * radius;
    double circleCircumference = 2 * Math.PI * radius;
    System.out.println("Area of the circle: " + circleArea);
        System.out.println("Circumference of the circle: " + circleCircumference);
        
        sc.close();
        
    }
}
