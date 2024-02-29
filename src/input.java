import  java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("enter your name");
        String name= input.next();

        System.out.print("enter your roll no");
        int rollno = input.nextInt();

        System.out.print("enter your marks");
        float mark= input.nextFloat();

        System.out.println(name +" your rollno is "+rollno +" and your marks are "+mark);
    }
}
