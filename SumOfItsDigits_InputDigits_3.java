package let_us_java;
import java.util.*;
public class SumOfItsDigits_InputDigits_3 {
    public static void main(String args[]){
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the five digit value:-");
        int sum=0;
        for(int i=0;i<5;i++){
            int a=sc.nextInt();
            sum=sum+a;
           
        }
        System.out.println(sum);
      sc.close();*/

      /*Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 5 digit values:");
    int n=sc.nextInt();
    int a=n%10;
    int b=n/10;
    int c=b%10;
    int d=b/10;
    int e=d%10;
    int f=d/10;
    int g=f%10;
    int h=f/10;
    int i=a+c+e+g+h;

    System.out.println(i);*/
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 5 digit values:");
    int n=sc.nextInt();
    int sum=0;
    while(n>0){
        int a=n%10;
        sum+=a;
        n=n/10;
    
    
    }
    System.out.println(sum);



    }
}
