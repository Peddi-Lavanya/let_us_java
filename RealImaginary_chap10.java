package let_us_java;
import java.util.*;
class Complex{
    float real,img;

    public Complex(){

    }
    public Complex(float r,float i){
        real=r;
        img=i;
    }
    public void getData(){
        float r,i;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        i=sc.nextInt();

    }
    public void setData(float r,float i){
        real=r;
        img=i;
    }
    public void displayData(){
        System.out.println("Real:"+real);
        System.out.println("img:"+img);
    }
    public Complex addComplex(Complex y){
        Complex t=new Complex();
        t.real=real+y.real;
        t.img=img+y.img;
        return t;
    }
    public Complex mulComplex(Complex y){
        Complex t=new Complex();
        t.real=real*y.real-img*y.img;
        t.img=real*y.img+y.real*img;
        return t;
    }
}
public class RealImaginary_chap10 {
    public static void main(String args[]){
    Complex c1=new Complex();
    c1.setData(2.0f,2.0f);
    Complex c2=new Complex();
    Complex c3=new Complex();
    c3=c1.addComplex(c2);
    System.out.println("Complex c3:");
    c3.displayData();

    Complex c4=new Complex();
    c4.getData();
    Complex c5=new Complex(2.5f,3.0f);
    Complex c6=new Complex();
    c6=c4.mulComplex(c5);
    System.out.println("Complex c6:");
    c6.displayData();

    Complex c7=new Complex();
    c7=c1.addComplex(c2.mulComplex(c3));
    System.out.println("Complex c7:");
    c7.displayData();

}
}
