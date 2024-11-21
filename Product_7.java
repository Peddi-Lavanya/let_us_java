package let_us_java;

public class Product_7 {
   public static void main(String args[]){
    float a=1.56f;
    int b=456;
    double product;
    product=productOf(a,b);
    System.out.println(product);
   } 
   static double productOf(float a,int b){
     double product;
     product=a*b;
     return product;
   }
   
}
