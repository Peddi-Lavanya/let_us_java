package let_us_java;

public class AreaOfTriangle_7 {
    public static void main(String args[]){
        int a=6;
        int b=7;
        int c=5;
     double area=areaOf(a,b,c);
     System.out.println(area);
    }
    static double areaOf(int a,int b,int c){
        int s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
