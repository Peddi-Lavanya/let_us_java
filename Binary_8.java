package let_us_java;
import java .util.*;
public class Binary_8 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        
        if(num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            String binary = decimalToBinary(num);
            System.out.println("Binary equivalent of " + num + " is: " + binary);
        }

    }

    public static String decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int bit = n % 2;
            binary.insert(0, bit); // Insert the bit at the beginning of the string
            n /= 2;
        }
        if (binary.length() == 0) {
            return "0"; // Special case for input 0
        }
        return binary.toString();
    }
}
