package let_us_java;
import java.util.*;
public class Factorial_Function_7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x=1;
        x=factorial(a);
        System.out.println(x);
    }
    static int factorial(int a){
        int result=1;
        for(int i=1;i<=a;i++){
            result=result*i;
        }
        return result;

    }
}
