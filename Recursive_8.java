package let_us_java;
import java.util.*;
public class Recursive_8 {
    public static void main(String args[]){
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

    /*Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 5-digit value:");
    int n=sc.nextInt();
    int sum=0;
    int b;
    int a=rec(n,b,sum);
    System.out.println(a);
    }
    static int rec(int n,int b,int sum){
        while(n>0){
            b=n%10;
            sum+=b;
            n=n/10;
        }
        return sum;*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 5-digit value:");
        int number=sc.nextInt();
        if(number<10000||number>99999){
            System.out.println("the given number is invalid please enter valid number");
        }
        else{
            int sum=calculateSumOfDigit(number);
            System.out.println("sum of the numbers:"+sum);
        }
            
    }
        static int calculateSumOfDigit(int number){
            if(number==0){
                return 0;
            }
            return number%10+calculateSumOfDigit(number/10);
        } 
    }
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5-digit positive integer: ");
        int number = scanner.nextInt();
        
        if (number < 10000 || number > 99999) {
            System.out.println("Invalid input. Please enter a 5-digit positive integer.");
        } else {
            int sum = calculateDigitSum(number);
            System.out.println("The sum of the digits is: " + sum);
        }
        
        scanner.close();
    }
    
    public static int calculateDigitSum(int number) {
        if (number == 0) {
            return 0;
        }
        
        return number % 10 + calculateDigitSum(number / 10);
    }
}*/

        
    

