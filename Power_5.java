package let_us_java;
import java.util.*;
public class Power_5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two different values a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        double x=Math.pow(a,b);
        System.out.println(a+ ":The base a raised to the power b :"+b +"is result x is" +x);
    }
}
