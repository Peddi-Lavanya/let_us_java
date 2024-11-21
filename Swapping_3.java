package let_us_java;
import java.util.*;
public class Swapping_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of one varible c:-");
        int c=sc.nextInt();
        System.out.println("Enter the value of variable d:-");
        int d=sc.nextInt();
        int temp=c;
        c=d;
        d=temp;
        System.out.println("after swapping the values are");
        System.out.println("the value of c is"+c);
        System.out.println("the value of d is"+d);
        
    }
}
