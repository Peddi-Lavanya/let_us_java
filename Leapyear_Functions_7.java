package let_us_java;
import java.util.*;
public class Leapyear_Functions_7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year :");
        int a=sc.nextInt();
        leapYear(a);
        
    }
    static int leapYear(int a){
        if((a%4==0&&a%100!=0)||a%400==0&&a%100==0){
            System.out.println("The given year is a leap year");
        }else{
            System.out.println("The given year is not a leap yeat");
        }
        return a;
    }
}
