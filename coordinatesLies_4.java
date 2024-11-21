package let_us_java;
import java.util.*;
public class coordinatesLies_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of coordinates x and y are:");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        if(x==0&& y==0){
            System.out.println("The coordinates lies on the circle");
        }else if(x==0){
            System.out.println("The coordinates lies on y_axis");
        }else if(y==0){
            System.out.println("The coordinates lies in x_axis");
        }else{
            System.out.println("it does not lies in x or y axis and origin also");
        }
    }
}
