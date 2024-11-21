package let_us_java;

public class Series_of_Factorial_5 {
    public static void main(String args[]){
        int sum=0;
        int x=1;
        for(int i=1;i<=7;i++){
            for(int j=1;j<=i;j++){
                x=x*j;
            }
            sum=sum+i/x;
        }
        System.out.println("Sum of the 1st seven factorial are:"+sum);
    }
}
