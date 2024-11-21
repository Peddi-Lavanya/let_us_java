package let_us_java;
import java.util.*;
public class Arrays_11 {
    public static void main(String args[]){
        /*int avg,sum=0;
        Scanner sc=new Scanner(System.in);
        int[]marks=new int[30];
        for(int i=0;i<=29;i++){
            System.out.println("Enter the marks");
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<=29;i++){
            sum=sum+marks[i];
            avg=sum/30;
            System.out.println("avg marks="+avg);
        }*/

        /*int marks[]={55,65,75,56,78,78,90};
        modify(marks);
        for(int i=0;i<=marks.length-1;i++){
            System.out.println(marks[i]);
           
            
        }
        static void modify(int[]m){
            for(int i=0;i<=marks.length-1;i++){
                m[i]=m[i]*2;
            }
            
        }*/



        int arr[]={25,45,11,6,78,1};
        System.out.println("original array:"+arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println("sorted array is:");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
        int b=Arrays.binarySearch(arr,11);
        System.out.println("the index value of 11 is:"+b);
        int[]newarr=new int[5];
        newarr=Arrays.copyOf(arr,arr.length);
        System.out.println("The new array is :");
        for(int i=0;i<=newarr.length;i++){
            System.out.println(newarr[i]);
        }
        Arrays.fill(arr,0);
        System.out.println("cleared data is :");
        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();


    }

    
}
