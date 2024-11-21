package let_us_java;
import java.util.*;
public class ReverseDigits_3 {
    public static void main(String args[]){
        
        /*int reverse=0;
        int lastDigit;*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of 5 digits:-");
        int n=sc.nextInt();
        //from chatgpt :
        /*while(n>0){
            lastDigit=n%10;
            reverse=reverse*10+lastDigit;
            n=n/10;
       }
       System.out.println("The reversed number of n is:-"+reverse);*/
//from here you did by yourself:=check this if you wanted a correct logic
       /*int a=n%10;
       int b=n/10;
       int c=b%10;
       int d=b/10;
       int e=d%10;
       int f=d/10;
       int g=f%10;
       int h=f/10;

       System.out.println(a+""+c+""+e+""+g+""+h);*/
//for only positive numbers
/*int b=0;
int a;
       while(n>0){
        a=n%10;
        //b=b*10+a;
        b=b*10-a;
        n=n/10;
        
       }
      
    System.out.println("the reversed value is :"+b);*/
//for both positive and negative numbers example:12345=54321 and-12345=-54321
int b=0;
int a;
       while(n>0||n!=0){
        a=n%10;
        //b=b*10+a;
        b=b*10+a;
        n=n/10;
        
       }
      
    System.out.println("the reversed value is :"+b);
       
    }
}
