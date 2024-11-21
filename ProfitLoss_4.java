package let_us_java;
import java.util.*;
public class ProfitLoss_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost_price of the item:");
        double cost_price=sc.nextDouble();
        System.out.println("Enter the selling_price of the item:");
        double selling_price=sc.nextDouble();
        double profitLoss=selling_price-cost_price;
        if(profitLoss>0){
            System.out.println("Seller made a profit:"+profitLoss);
        }else if(profitLoss<0){
            System.out.println("Sellet  made a loss of:"+profitLoss);
        }else{
            System.out.println("No profir no loss");
        }
    }
}
