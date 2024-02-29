import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("----- CALCULATOR -----");
            System.out.println("Press 1 to add   Numbers");
            System.out.println("Press 2 to Sub   Numbers");
            System.out.println("Press 3 to Multi Numbers");
            System.out.println("Press 4 to Div   Numbers");
            System.out.println("Press 0 to Exit");
            System.out.print("Enter your choice: ");
            int ch = input.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter first number: ");
                    int a = input.nextInt();
                    System.out.print("Enter second number: ");
                    int b = input.nextInt();
                    int c = a + b;
                    System.out.println("Sum of given numbers is : " + c);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    int aa = input.nextInt();
                    System.out.print("Enter second number: ");
                    int bb = input.nextInt();
                    int cc = aa - bb;
                    System.out.println("Sub of given numbers is : " + cc);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    int aaa = input.nextInt();
                    System.out.print("Enter second number: ");
                    int bbb = input.nextInt();
                    int ccc = aaa * bbb;
                    System.out.println("Multiple of given numbers is : " + ccc);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    int aaaa = input.nextInt();
                    System.out.print("Enter second number: ");
                    int bbbb = input.nextInt();
                    int cccc = aaaa / bbbb;
                    System.out.println("Division of given numbers is : " + cccc);
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
