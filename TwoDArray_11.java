package let_us_java;
import java.util.*;
public class TwoDArray_11 {
    public static void main(String args[]){
        /*int[][]a={{7,2,6,1},{3,5,4,8},{6,2,9,50}};
        int big=a[0][0];
        int row=0;
        int column=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]>big){
                    big=a[i][j];
                    row=i;
                    column=j;
                }
            }
        }
        System.out.println("Biggest number is:"+big);
        System.out.println("row="+row+"Column="+column);
        */
        int [][]a=new int[3][4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][i]=sc.nextInt();
                System.out.println(a[i][j]);
            }
        }


    }
}
