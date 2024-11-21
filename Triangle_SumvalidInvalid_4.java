package let_us_java;
import java.util.*;
public class Triangle_SumvalidInvalid_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three angles of the triangle:-");
        int angle1=sc.nextInt();
        int angle2=sc.nextInt();
        int angle3=sc.nextInt();
        int sum=angle1+angle2+angle3;
        if(sum==180){
            System.out.println("the sum of all the 3 triangles are valid");
        }else{
            System.out.println("the sum of three values is invalid");
            }
    }
}
