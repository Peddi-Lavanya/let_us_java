package let_us_java;
import java.util.*;
public class Distance_circle_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coordinates of the circle x and y:");
        double x_circle=sc.nextDouble();
        double y_circle=sc.nextDouble();
        System.out.println("Enter the radious of the circle:");
        double radious=sc.nextDouble();
        System.out.println("Enter the co-ordinates of the point x and y:");
        System.out.println("x co-ordinate");
        double x=sc.nextDouble();
        System.out.println("y co-ordinate");
        double y=sc.nextDouble();

        double distance=Math.sqrt(Math.pow(x_circle-x,2)+Math.pow(y_circle-y,2));
        if(distance<radious){
            System.out.println("The radious lies inside the circle");
        }else if(distance==radious){
            System.out.println("The radious lies on the circle");
        }else if(distance>radious){
            System.out.println("The radious lies outside the circle");
        }

    }
}
