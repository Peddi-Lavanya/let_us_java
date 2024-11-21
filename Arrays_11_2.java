package let_us_java;
import java.util.*;
public class Arrays_11_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[25];
        int positiveCount=0;
        int negativeCount=0;
        int evenCount=0;
        int oddCount=0;

        System.out.println("Enter the values:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>=0){
                positiveCount++;            
            }else if(arr[i]<0){
                negativeCount++;
            }
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("positive numbers are:"+positiveCount);
        System.out.println("Negative numbers are:"+negativeCount);
        System.out.println("Even numbers are:"+evenCount);
        System.out.println("Odd numbers are:"+oddCount);
           
            
        }
        
        
        

    }

