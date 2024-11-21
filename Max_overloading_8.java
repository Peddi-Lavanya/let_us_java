package let_us_java;
import java.util.*;
public class Max_overloading_8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of integer type a and b :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the values of float c and d:");
        float c=sc.nextFloat();
        float d =sc.nextFloat();
        System.out.println("Enter the double values of e and f:");
        double e=sc.nextDouble();
        double f=sc.nextDouble();
        int g=max(a,b);
        float h=max(c,d);
        double i=max(e,f);
        System.out.println("Max value of integer is"+g);
        System.out.println("Max value of float is:"+h);
        System.out.println("Max value of double is:"+i);
    }
        static int max(int a,int b){
            if(a>b){
                System.out.println(a+"a is the max value");
                return a;
            }else{
                System.out.println(b+"b is the min value");
                return b;
            }
            
        }
        static float max(float c,float d){
            if(c>d){
                System.out.println(c+"c is the max value");
                return c;
            }else{
                System.out.println(d +"d is the min value");
                return d;
            }
        }
            static double max(double e,double f){
                if(e>f){
                    System.out.println(e+"e is the max value");
                    return e;
                }else{
                    System.out.println(f+"f is the min value");
                    return f;
                }
            }

}



