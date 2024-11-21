package let_us_java;

public class Recursive_power_8 {
    static int calcPower(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int a=x*calcPower(x, n-1);
        return a;
    }
    public static void main(String args[]){
        int x=2,n=5;
        int power=calcPower(x,n);
        System.out.println(power);
    }
}
