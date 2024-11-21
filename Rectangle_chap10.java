package let_us_java;
import java.util.*;
class Rectangle{
     int len,breath;
    public void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breath values:");
        len=sc.nextInt();
        breath=sc.nextInt();
    }
    public void setData(int l,int b){
        len=l;
        breath=b;
    }
    public void display(){
        System.out.println("length:"+len);
        System.out.println("Breath:"+breath);
    }
    public void areaPerimeter(){
        int a,p;
        a=len*breath;
        p=2*(len+breath);
        System.out.println(a);
        System.out.println(p);
    }

}

public class Rectangle_chap10 {
    public static void main(String argsp[]){
        Rectangle r=new Rectangle();
        r.setData(25,3);
        r.display();
        r.areaPerimeter();
        Rectangle r1=new Rectangle();
        r1.setData(5,4);
        r1.display();
        r1.areaPerimeter();
        Rectangle r3=new Rectangle();
        r3.getData();
        r3.display();
        r3.areaPerimeter();
    }
}
