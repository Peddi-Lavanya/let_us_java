package let_us_java;
import java.util.*;
public class ArrayStudents_11 {
    public static void main(String args[]){
        int[]a,b;
        int num,newnum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the students Marks:");
        num=sc.nextInt();
        a=new int[num];
        System.out.println("The students"+num+"marks are:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("some additional students marks are");
        newnum=sc.nextInt();
        b=new int[num+newnum];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.println("the marks "+newnum+"are:");
        for(int i=a.length;i<b.length;i++){
            b[i]=sc.nextInt();
            
        }
        System.out.println("The new array is :");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }

    }
}
