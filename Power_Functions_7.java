package let_us_java;
import java.util.*;
public class Power_Functions_7 {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the values of a and b are:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    double x=powerOf(a,b);
    System.out.println(x);

   } 
   static double powerOf(int a,int b){
    double result=1;
    result=Math.pow(a,b);
    return result;
   }
   
}
