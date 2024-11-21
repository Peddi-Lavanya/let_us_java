package let_us_java;
import java.util.*;
public class Switch_6 {
    public static void main(String args[]){
        //code by myself
       Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("factorail of a number");
            System.out.println("prime or not");
            System.out.println("odd or even");
            System.out.println("exit");

            System.out.println("Enter the number of your choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                 System.out.println("Enter the number");
                 int n=sc.nextInt();
                 int x=1;
                 for(int i=1;i<=n;i++){
                    x*=i;
                 }
                 System.out.println("Factorial of the  number is:"+x);
                 break;
                 case 2:
                 System.out.println("Enter the number of your choice:");
                 int n1=sc.nextInt();
                 for(int i=1;i<=n1;i++){
                    boolean isPrime =true;
                    for(int j=1;j<=i/2;j++){
                        if(i%j==0){
                        isPrime=false;
                        break;
                        }
                    }
                    if(isPrime){
                        System.out.println("the number is a prime");
                        break;
                    }
                 }
                 
                 case 3:
                 System.out.println("Enter the  value :");
                 int n2=sc.nextInt();
                 if(n2%2==0){
                    System.out.println("the given number is even number");
                 }
                 else{
                    System.out.println("The given number is odd number");
                    break;
                 }
               
                 case 4:
                 System.out.println("Exiting the program");
                 System.exit(0);
                 
                 defalt:
                 System.out.println("Invalid choice please choose correct");


            }
        }
    }
}
//code by chatgpt
/*Scanner scanner = new Scanner(System.in);
        
while (true) {
    System.out.println("\nMenu:");
    System.out.println("1. Factorial of a number");
    System.out.println("2. Prime or not");
    System.out.println("3. Odd or even");
    System.out.println("4. Exit");

    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();
    
    switch (choice) {
        case 1:
            System.out.print("Enter a number: ");
            int num1 = scanner.nextInt();
            int factorial = 1;
            for (int i = 1; i <= num1; i++) {
                factorial *= i;
            }
            System.out.println("Factorial: " + factorial);
            break;
        case 2:
            System.out.print("Enter a number: ");
            int num2 = scanner.nextInt();
            boolean isPrime = true;
            if (num2 <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num2); i++) {
                    if (num2 % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            System.out.println(num2 + (isPrime ? " is prime." : " is not prime."));
            break;
        case 3:
            System.out.print("Enter a number: ");
            int num3 = scanner.nextInt();
            System.out.println(num3 + (num3 % 2 == 0 ? " is even." : " is odd."));
            break;
        case 4:
            System.out.println("Exiting the program.");
            System.exit(0);
        default:
            System.out.println("Invalid choice. Please select a valid option.");
    }
}
}
}*/
