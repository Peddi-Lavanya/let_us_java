package let_us_java;
import java.util.*;
public class Rectangle_lengthBreath_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breath values:");
        int length=sc.nextInt();
        int breath=sc.nextInt();
        int area=length*breath;
        int perimeter=2*(length+breath);
        System.out.println("The area of rectangle is:"+area);
        System.out.println("The perimeter of a rectangle is:"+perimeter);
        if(area>perimeter){
            System.out.println("The area is greater");
        }else{
            System.out.println("The perimeter is greater");
        }
    }
}
