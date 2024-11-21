package let_us_java;

public class Arrays_11_5 {
    public static void main(String args[]){
        /*int arr[][]={
            {12,6, 45,3},
            {3, 56,22,8},
            {6, 5, 88,17},
            {12,13,87,89}};
        int traversArr[][]=new int[4][4];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                traversArr[i][j]=arr[j][i];
                
            }
            
        }
        System.out.println("traverse array is:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(traversArr[i][j]+" ");
            }
            System.out.println();
        }*/
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,1,2,3},
            {3,4,8,7}};
        int traverseArr[][]=new int[4][4];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                traverseArr[i][j]=arr[j][i];
            }
        }
        System.out.println("Traversal array is:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(traverseArr[i][j]);
            }
            System.out.println();
        }
        
    }
}
