package let_us_java;

public class Recursive_sum_8 {
    public static void main(String args[]){
        int n=25;
        int sum=calculateSum(n);
        System.out.println("running sum of"+n+" natural numbers is:"+sum);
    }
    static int calculateSum(int n){
        if(n==1){
            return 1;
        }
        return n+calculateSum(n-1);
    }
}
