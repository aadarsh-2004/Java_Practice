import java.util.Scanner;
public class sum_using_function {
    public static void main(String[] args) {
        sum();

        int ans = sum2();
        System.out.println(ans);

        int anss=sum3(20,40);
        System.out.println(anss);
    }
    // passing the value while calling
    static int sum3(int a,int b){
        int sum = a+b;
        return sum;
    }
    // return the value
    static int sum2(){
        Scanner input  = new Scanner(System.in);
        System.out.println("Program to Add 2 Numbers");
        System.out.print("Enter first number ");
        int a = input.nextInt();
        System.out.print("Enter second number ");
        int b = input.nextInt();
        int c= a+b;
        return c;

    }
    // Do not return value
    public static void sum(){
        Scanner input  = new Scanner(System.in);
        System.out.println("Program to Add 2 Numbers");
        System.out.print("Enter first number ");
        int a = input.nextInt();
        System.out.print("Enter second number ");
        int b = input.nextInt();
        int c= a+b;
        System.out.print("Sum of 2 numbers is : "+ c);

    }
}
