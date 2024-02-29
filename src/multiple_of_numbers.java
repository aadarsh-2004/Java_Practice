import java.util.Scanner;

public class multiple_of_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Multiple of two Numbers ");
        System.out.print("Enter First Number");
        int a = input.nextInt();
        System.out.print("Enter Second Number ");
        int b = input.nextInt();
        int c =a*b;
        System.out.println("A x B is "+c);
    }
}
