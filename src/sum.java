import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program to Add 2 Numbers");
        System.out.print("Enter first number ");
        int a = input.nextInt();
        System.out.print("Enter second number ");
        int b = input.nextInt();
        int c= a+b;
        System.out.print("Sum of 2 numbers is : "+ c);
    }
}
