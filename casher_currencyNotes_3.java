package let_us_java;
import java.util.*;
public class casher_currencyNotes_3 {
    public static void main(String args[]){
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount=sc.nextInt();
        int hundreds=amount/100;
        int fifty=(amount%100)/50;
        int tens=((amount%100)%50)/10;

        System.out.println("Minimum  number of currency notes:");
        System.out.println("Hundreds are:-"+hundreds);
        System.out.println("fifty's are:-"+fifty);
        System.out.println("tens are :-"+tens);
        sc.close();*/


    //if we have less than 100 then we use if statement:-

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount");
    int amount=sc.nextInt();
    if(amount<100){
        int fifty=amount/50;
        int tens=(amount%50)/10;
        System.out.println("fifty's are:"+fifty);
        System.out.println("tens are:"+tens);
    }
    if(amount>100){
        int hundreds=amount/100;
        int fifty=(amount%100)/50;
        int tens=((amount%100)%50)/10;
        System.out.println("hundreds are:"+hundreds);
        System.out.println("fifty's are:"+fifty);
        System.out.println("tens are:"+tens);
    }
    }
}
