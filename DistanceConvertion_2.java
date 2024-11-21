package let_us_java;
import java.util.*;
public class DistanceConvertion_2 {
    public static void main(String args[]){
        System.out.println("Enter the distance between two cities");
        Scanner sc=new Scanner(System.in);
        double distance_km=sc.nextDouble();
        double distance_meter=distance_km*1000;
        double distance_feet=distance_km*3280.84;
        double distance_inches=distance_km*39370.1;
        double distance_centemeter=distance_km*100000;

        System.out.println("Distance in meter is:-"+distance_meter);
        System.out.println("Distance in feet is:-"+distance_feet);
        System.out.println("Distance in inches is:-"+distance_inches);
        System.out.println("Distance in centemeter is:-"+distance_centemeter);
        sc.close();
    }
}
