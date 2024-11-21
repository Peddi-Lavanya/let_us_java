package let_us_java;
import java.util.*;
public class Triangle_SumOfvalidInvalid_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 values of  the triangle:-");
        int T1=sc.nextInt();
        int T2=sc.nextInt();
        int T3=sc.nextInt();
        if((T1+T2>T3)&&(T2+T3>T1)&&(T3+T1>T2)){
            System.out.println("The triangle is valid");
        }else{
            System.out.println("the triangle is invalid");
        }
    }
}
