package let_us_java;

import lavanya.recursion;

public class Recursive_EvenOdd_8 {
    static int calcPower(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return calcPower(x, n/2)*calcPower(x, n/2);
        }
        else{
            return calcPower(x,n/2)*calcPower(x, n/2);
        }
    }
    public static void main(String args[]){
        int x=2,n=5;
        int a=calcPower(x,n);
        System.out.println(a);
    }
}
