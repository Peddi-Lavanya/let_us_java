package let_us_java;

public class Formula_5 {
    public static void main(String args[]){
        System.out.println("values are");
        for(double y=1;y<=6;y++){
            for(double x=5.5;x<=12.5;x+=0.5){
                double i=2+(y+0.5*x);
                System.out.println(y+""+x+""+i);
            }
        }
    }
}
