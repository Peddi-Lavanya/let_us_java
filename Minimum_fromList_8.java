package let_us_java;

public class Minimum_fromList_8 {
    public static void main(String[] args) {
        // Example usage
        int min = fun(5, 3, 9, 2, 8);
        System.out.println("Minimum number is: " + min);
    }

    public static int fun(int... min) {

        
        // Initialize minNum with the first element
        int minNum = min[0];
        
        // Loop through the remaining elements
        for (int i = 1; i < min.length; i++) {
            // Update minNum if the current element is smaller
            if (min[i] < minNum) {
                minNum = min[i];
            }
        }
        
        // Return the minimum number
        return minNum;
    }
}