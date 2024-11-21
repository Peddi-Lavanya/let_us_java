package let_us_java;
import java.util.*;
public class primeNumbers_8 {
    public static void main(String args[]){
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int a=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                a=a+1;
            }
            
        }
        if(a==0){
            System.out.println("This is a prime number");
        }else{
            System.out.println("This is not a prime number");
        }*/

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int a=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                a++;
                
            }
            
        }
        if(a==0){
            System.out.println("The given number is prime ");
        }else{
            System.out.println("The given number is not a prime number");
        }*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int n=sc.nextInt();
        int a=0;
        for(int i=2;i<n;i++){
            a=1;
            for(int j=2;j*j<n;j++){
                if(i%j==0){
                    a=0;
                    break;
                }
                

            }
            if(a==1){
                System.out.println(i);
            }
        }


    }
}
