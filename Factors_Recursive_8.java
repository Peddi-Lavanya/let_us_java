package let_us_java;
import java.util.*;
public class Factors_Recursive_8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value:");
        int number=sc.nextInt();
        for(int i=2;i<number;i++){
            while(number%i==0){
                System.out.println(i+"");
                number=number/i;
            }
            if(number>2){
                System.out.println(number);
            }
        }
        }
        }


