package let_us_java;
import java.util.*;
class Number{
    int i;
    public void setData(int j){
        i=j;
    }
    public void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        i=sc.nextInt();
    }
    public Number(){

    }
    public Number(int j){
        i=j;
    }
    public void display(){
        System.out.println("value of i="+i);
    }

}
public class Number_chap10 {
    public static void main(String args[]){
        Number n=new Number();
        n.display();
        n.setData(25);
        n.display();
        Number n1=new Number();
        n1.display();
        n1.getData();
        n1.display();
        Number n2=new Number(10);
        n2.display();
        
    }
}
