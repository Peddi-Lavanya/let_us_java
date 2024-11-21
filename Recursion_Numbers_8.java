package let_us_java;

public class Recursion_Numbers_8 {
    //printing numbers from 5 to 1
   /* static int printNumbers(int n){
        if(n==0){
            return n;
        }
        System.out.println(n);
        return printNumbers(n-1);

    }
    public static void main(String args[]){
        int n=5;
        printNumbers(n);
        
    }
}*/
/*
static int printNumbers(int n){
    if(n==6){
        return 6;
    }
    System.out.println(n);
    return printNumbers(n+1);
    
}
public static void main(String args[]){
    int n=0;
    printNumbers(n);
}
}*/

//sum of 1 to 5:-
public static void printSum(int i,int n,int sum){
    if(i==n){
        sum+=i;
        System.out.println(sum);
        return;
    }
    sum+=i;
    printSum(i+1,n,sum);
}
public static void main(String args[]){
    printSum(1,5,0);
}
}
