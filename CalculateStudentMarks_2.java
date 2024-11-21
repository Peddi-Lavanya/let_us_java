package let_us_java;
import java.util.*;
public class CalculateStudentMarks_2 {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter marks of maths:-");
     int maths=sc.nextInt();
     System.out.println("Enter marks of java:- ");
     int java=sc.nextInt();
     System.out.println("Enter marks of python:-");
     int python=sc.nextInt();
     System.out.println("Enter marks of operating system:-");
     int operatingSystem=sc.nextInt();
     System.out.println("Enter marks of Advanced java:-");
     int AdvancedJava=sc.nextInt();
     int aggregateMarks=maths+java+python+operatingSystem+AdvancedJava;
    double percentageMarks=(aggregateMarks/500.0)*100;
     System.out.println("Aggregate marks are:-"+aggregateMarks);
     System.out.println("percentage marks are:-"+percentageMarks+"%");
     sc.close();
    }
}
