import java.util.Scanner;

public class sum_of_N_numbers {
    public static void main(String[] args) {
        System.out.println("Enter value of N: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
