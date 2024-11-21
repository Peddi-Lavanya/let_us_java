package let_us_java;

class Sample{
    private int i;
    private float a;

    public Sample(int ii,float aa){
        i=ii;
        a=aa;
    }
    public void display(){
        System.out.println("i="+i+"a="+a);
    }
}
public class Arrays_object_11 {
     public static void main(String args[]){
        Sample[]arr=new Sample[3];//we are creating an object for the class ,we can directly place this integr values in the object itself
        arr[0]=new Sample(10,15.2f);
        arr[1]=new Sample(15,46.2f);
        arr[2]=new Sample(78,46.4f);
        for(Sample s:arr){
            s.display();
        }

    }
}
