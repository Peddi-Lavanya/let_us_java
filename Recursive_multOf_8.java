package let_us_java;

public class Recursive_multOf_8 {
    static int multOf(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            int b=n*multOf(n-1);
            return b;
        }
    }
    public static void main(String args[]){
        int n=6;
        int a=multOf(n);
        System.out.println(a);
    }
}
