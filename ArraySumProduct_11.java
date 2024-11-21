package let_us_java;

public class ArraySumProduct_11 {
    /*static int getSum(int[][]a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
            }

        }
        return sum;
        

    }
    static int[][] getArray(){
        int[][]b={{1,2,3},{4,5,6},{7,8,9}};
        return b;
    }
    public static void main(String args[]){
        int[][]a={{7,20,3},{2,4,6}};
        int sum=getSum(a);
        System.out.println("Sum="+sum);

        int [][]b=getArray();
        int product=1;
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                product=product*b[i][j];
    
            }
            
        }
        System.out.println("product is:"+product);

    }*/

    /*static int sumOf(int[][]a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
        }
        return sum;
    }
    static int[][]productOf(){
        int[][]b={{1,2,3},{4,5,6},{7,8,9}};
        
        return b;

    }
    public static void main(String args[]){
        int[][]a={{1,2,3},{4,5,6}};
        int sum=sumOf(a);
        System.out.println("Sum of this values are:"+sum);

        //product of:

        int[][]b=productOf();
        int product=1;
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                product*=b[i][j];
            }
        }
        System.out.println("product of :"+product);
}*/
public static void main(String args[]){
int a[][]=new int[3][];
 a[0]=new int[4];
 a[1]=new int[3];
 a[2]=new int[2];
 a[0][0]=7;a[0][1]=2;a[0][2]=6;a[0][3]=1;
 a[1][0]=9;a[1][1]=3;a[1][2]=4;
 a[2][0]=1;a[2][1]=8;
 for(int i=0;i<a.length;i++){
    for(int j=0;j<a[i].length;j++){
        System.out.print(a[i][j]);
 }
 System.out.println();

    }
}
}