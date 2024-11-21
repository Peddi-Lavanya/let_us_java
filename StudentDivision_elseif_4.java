package let_us_java;
import java.util.*;
public class StudentDivision_elseif_4 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 3 subjects values:");
    int m1=sc.nextInt();
    int m2=sc.nextInt();
    int m3=sc.nextInt();
    int percentage=(m1+m2+m3)*100/300;
    if(percentage>=60){
        System.out.println("First division");
    }
    else if(percentage>=50){
        System.out.println("Second division");
    }
    else if(percentage>=40){
        System.out.println("Third division");
    }
    else{
        System.out.println("fail");
    }
}
}