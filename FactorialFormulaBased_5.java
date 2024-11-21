package let_us_java;
import java.util.*;
public class FactorialFormulaBased_5 {
    public static void main(String args[]){
        System.out.println("Enter the value of x:");
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double sum=0;
        double term=(x-1)/x;
        for(int i=1;i<=7;i++){
                sum+=term;
             term*=0.5*Math.pow(x-1/x,i);
        }
        System.out.println("Sum of first seven terms are :"+sum);
    }
}
