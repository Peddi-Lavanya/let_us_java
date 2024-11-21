import java.util.*;
public class Min_overloading_8 {
    public static void main(String args[]){
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=min(a,b);
        System.out.println("The min value of two numbers are :"+c);
    }
    static int min(int a,int b){
        if(a<=b){
            System.out.println("the minimum value is:"+a);
            return a;
        }else{
            System.out.println("The maximum value is:"+b);
            return b;
        }*/
        int minOfTwo=min(5,10);
        System.out.println("The minimum value is:"+minOfTwo);
        int minOfThree=min(9,20,1);
        System.out.println("The minimum value is:"+minOfThree);
        int minOfMultiple=min(10,5,6,3,6);
        System.out.println("The minimum value is:"+minOfMultiple);
    }
    static int min(int a,int b){
        return Math.min(a,b);

    }
    static int min(int a,int b,int c){
        return Math.min(Math.min(a,b),c);
    }
    static int min(int... numbers) {
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

}
