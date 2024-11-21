package let_us_java;
import java.util.*;
public class Ages_younger_4 {
    public static void main(String argsp[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the ages of ram,shyam,ajay");
    int ram_age=sc.nextInt();
    int shyam_age=sc.nextInt();
    int ajay_age=sc.nextInt();
    int youngest_age=Math.min(ram_age,Math.min(shyam_age,ajay_age));
    if(youngest_age==ram_age){
        System.out.println("the youngest age of 3 members is:"+ram_age);
    }else if(youngest_age==shyam_age){
        System.out.println("the youngest age of 3 members:"+shyam_age);
    }else{
        System.out.println("the youngest age of 3 menbers is:"+ajay_age);
    }

    }
}

