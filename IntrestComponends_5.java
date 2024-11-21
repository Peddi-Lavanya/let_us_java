package let_us_java;
import java.util.*;
public class IntrestComponends_5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 sets of values:");
        System.out.println("Enter the value of p principle:");
        double p=sc.nextDouble();
        System.out.println("Enter the value of r the annual intrest rate in percentage");
        double r=sc.nextDouble()/100;
        System.out.println("Enter the number of years n:");
        double n=sc.nextDouble();
        System.out.println("Enter number of times interest is compounded per year (q): ");
        double q=sc.nextDouble();

        double A=p*Math.pow(1+r/q,n*q);
        System.out.println("Amount (A) after " + n + " years: " + A);

    }
}