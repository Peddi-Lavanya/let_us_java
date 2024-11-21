package let_us_java;

public class Recursive_SumAdd_8 {
    static int sumOf(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            int b=n+sumOf(n-1);
            return b;
        }
    }
    public static void main(String args[]){
        int n=6;
        int a=sumOf(n);
        System.out.println(a);
    }
}
