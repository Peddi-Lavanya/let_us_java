package let_us_java;
import java.util.*;
public class LeapYear_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any year:");
        int year=sc.nextInt();
        if((year%4==0&& year%100!=0)||(year%100==0&&year%400==0)){
            System.out.println("the given year is leap year");
        }else{
            System.out.println("the given year is not a leap year");
        }

    }
}
