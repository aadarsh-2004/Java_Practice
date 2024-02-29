import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int inputNumber = scanner.nextInt();

        // Call the function to calculate factorial
        long result = calculateFactorial(inputNumber);

        // Display the result
        System.out.println("Factorial of " + inputNumber + " is: " + result);
    }

    // Function to calculate factorial
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            // Loop to calculate factorial
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
