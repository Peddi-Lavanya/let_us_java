
import java.util.*;
public class Recursion_factorial_8 {
    public static void main(String args[]){
        int a,fact;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
         a=sc.nextInt();
         fact=rec(a);
         System.out.println("The value of factorial is"+fact);
    }
    static int rec(int a){
        int f;
        if(a==0||a==1){
            return 1;
        }
        else{
            /*f=a*(a-1);
            return f;*/
            int b=1;
            for(int i=1;i<=a;i++){
                b*=i;
            }
        }
    }
}
