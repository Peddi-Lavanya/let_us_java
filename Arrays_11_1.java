package let_us_java;
import java.util.*;
public class Arrays_11_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[]a;
        System.out.println("Enter the number:");
        int b=sc.nextInt();
        a=new int[b];
        System.out.println("Enter the values:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number to be searched:");
        int c=sc.nextInt();
       int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==c){
                count++;
                
            }
        
        }
        if(count>0){
            System.out.println(c+"appears"+count+"times in an array");
        }else{
            System.out.println(c+"does not appears in an array");
        }
    }

}
