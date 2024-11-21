package let_us_java;
import java.util.*;
public class Fahrenheit_2 {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of fahrenheit:-");
       double fahrenheit=sc.nextDouble();
       double celsius=(fahrenheit-32)*5/9;  
       System.out.println(" Temparature in fahrenheit is:-"+fahrenheit);
       System.out.println("Temparature in Celsius is:-"+celsius);
    }
}
