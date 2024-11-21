package let_us_java;
import java.util.*;
public class OddEven_4 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number:");
    int number=sc.nextInt();

    if(number%2==0){
        System.out.println("The number is even");
    }
    else{
        System.out.println("The number is odd");
    }



    }
}
