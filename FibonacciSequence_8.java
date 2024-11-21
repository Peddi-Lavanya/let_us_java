package let_us_java;

public class FibonacciSequence_8 {
    public static void main(String args[]){
       /* int n=25;
        int a=0;
        int b=1;
        System.out.print(a+" ");
            System.out.print(b+" ");       
        for(int i=2;i<=n;i++){

            int c=a+b;
            a=b;
            b=c;
            
            System.out.print(c+" ");
        }*/

        //fibonacci using method 
       /* int n=25;
        int d=fibonacciSeries(n);
        System.out.print(d+" ");
        
    }
    static int fibonacciSeries(int n){
        int a=0;
        int b=1;
        int c=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
        return c;
        */
    
       //the code is correct for recursion:-
            System.out.print("Fibonacci Series up to 25 terms: ");
            for (int i = 0; i < 25; i++) {
                System.out.print(fibonacciMethod(i) + " ");
            }
            public static int fibonacciMethod(int n) {
                if (n <= 1)
                    return n;
                return fibonacciMethod(n - 1) + fibonacciMethod(n - 2);
            }
        }
    }
    


