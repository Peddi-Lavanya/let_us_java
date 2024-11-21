package let_us_java;

public class Recursive_Fibonacci_8 {
    static int printFibonacci(int a,int b,int n){
        if(n==0){
            return 1;
        }
        int c=a+b;
        System.out.print(c+" ");
        return printFibonacci(b, c, n-1);
    }
    public static void main(String args[]){
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n=7;
        printFibonacci(a,b,n);
    }
}
