package let_us_java;
import java.util.*;
public class Triangle_properties_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 sides of the triangle");
        int T1=sc.nextInt();
        int T2=sc.nextInt();
        int T3=sc.nextInt();

        if(T1==T2&&T2==T3){
            System.out.println("the three sides are equilateral");
        }
        else if(T1==T2||T2==T3||T3==T1){
            System.out.println("The three sides are isosceles");
        }
        else if(T1!=T2 &&  T2!=T3&& T3!=T1){
            System.out.println("The three sides are scalene");
        }
        else if(Math.pow(T1,2)==Math.pow(T2,2)+Math.pow(T3,2)||Math.pow(T2,2)==Math.pow(T3,2)+Math.pow(T1,2)||Math.pow(T3,2)==Math.pow(T1,2)+Math.pow(T2,2)){
            System.out.println("The three sides are right angled triangle");
            }
    }
}
