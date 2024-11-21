package let_us_java;
import java.util.*;
public class Arrays_11_6 {
    public static void main(String args[]){
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st point of x coordinate");
        int x=sc.nextInt();
        System.out.println("Enter the 1st point of y coordinate");
        int y=sc.nextInt();
        System.out.println("Enter the 2nd point of x coordinate");
        int x1=sc.nextInt();
        System.out.println("Enter the 2nd point of y coordinate");
        int y1=sc.nextInt();
        double distance=Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y,2));
        System.out.println(distance);*/



        Scanner sc=new Scanner(System.in);
        int[]x=new int[10];
        int[]y=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter the x value:");
            x[i]=sc.nextInt();
            System.out.println("Enter the value of y:");
            y[i]=sc.nextInt();
        }
        double distance=Math.sqrt(Math.pow(x[9]-x[0],2)+Math.pow(y[9]-y[0],2));
        System.out.println("The distance between 1st and last value is:"+distance);

    }
}
