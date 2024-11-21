package let_us_java;

public class PrimeNumbers_5 {
    public static void main(String args[]){
        int number=25;
        for(int i=2;i<=number;i++){
           // System.out.println("i:"+i);
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++){
               // System.out.println("j"+j);
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(+i+" ");
            }
        }
    }
}
