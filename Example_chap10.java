package let_us_java;
class Example{
    int data;
    public Example(){
        System.out.println("Inside the constructor");
    }
    protected void finalize()throws Throwable{
        super.finalize();
    }
}
public class Example_chap10 {
    public static void main(String args[]){
        Example e=new Example(); 
    }
}
