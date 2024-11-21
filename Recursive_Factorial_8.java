package let_us_java;

public class Recursive_Factorial_8 {
    static int factorialNumber(int n){
        if(n==0||n==1){
            return 1;
        }
        
        int b=n*factorialNumber(n-1);
        return b;
    }
    public static void main(String args[]){
        int n=6;
        int b=factorialNumber(n);
        System.out.println(b);
        
    }
}
