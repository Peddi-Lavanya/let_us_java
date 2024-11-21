package let_us_java;
import java.util.*;
public class Maried_unmarried_4 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter age ,sex,marital status");
    int age=sc.nextInt();
    char sex=sc.next().charAt(0);
    char maritalStatus=sc.next().charAt(0);
    if((maritalStatus=='M')||(maritalStatus=='U'&& sex=='M'&& age>30)||(maritalStatus=='U'&&sex=='F'&&age>25)){
        System.out.println("Driver is insured");
    }
    else{
        System.out.println("Driver is not insured");
    }
}
}
