package let_us_java;
import java.util.*;
public class GrossSalary1_4 {
    public static void main(String args[]){
        double basicSalary,HRA,DA,grossSalary;
        System.out.println("Enter a basic salary");;
        Scanner sc=new Scanner(System.in);
        basicSalary=sc.nextFloat();
        if(basicSalary<1500){
            HRA=10/100*basicSalary;
            DA=90/100*basicSalary;
        }
        else{
            HRA=1500;
            DA=98/100*basicSalary;
        }
        grossSalary=basicSalary+HRA+DA;
        System.out.println("the value of gross salary:"+grossSalary);
    }
}
