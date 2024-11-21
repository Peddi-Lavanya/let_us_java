package let_us_java;

public class DecimalResult_7 {
    public static void main(String args[]){
        int a=45;
        float b=12.6f;
        double c=20.45;
        double d=funOf(a,b,c);
        System.out.println(d);
    }
    static double funOf(int a,float b,double c){
        double d=a+b/c;
        return d;
    }
}
