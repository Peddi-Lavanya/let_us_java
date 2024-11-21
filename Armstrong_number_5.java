package let_us_java;

public class Armstrong_number_5 {
    public static void main(String args[]){
        System.out.println("armstrong numbers between 1 to 500");
        int i=1, a,b,c;//153=1*1*1+5*5*5+3*3*3=153  1st we need 3 then 153%10=3
        while(i<=500){
            a=i%10;//a=3
            b=i%100;//b=53
            b=(b-a)/10;//53-3/10=5
            c=i/100;//1
            if((a*a*a)+(b*b*b)+(c*c*c)==i){
                System.out.println(i);
            }
            i++;
        }
    }
}
