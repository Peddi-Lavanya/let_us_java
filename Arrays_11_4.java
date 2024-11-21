package let_us_java;
import java.util.*;
public class Arrays_11_4 {
    public static void main(String args[]){
       int arr[]={15,20,45,60,15,19};
       int revArray[]=new int[arr.length];
       for(int i=0;i<arr.length;i++){
        revArray[i]=arr[arr.length-1-i];

    }
    System.out.println("reversed array is:");
    for(int num:revArray){
        System.out.print(num+" ");
    }
            
       
    }
    
}
