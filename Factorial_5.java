package let_us_java;
import java.util.*;
public class Factorial_5 {
    public static void main(String args[]){
        int x=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
           x=x*i;
        }
        System.out.println("The factorial of the number is:"+x);
    }
}
