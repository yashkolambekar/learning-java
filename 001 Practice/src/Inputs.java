import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter your roll no: ");
        // int rollno = input.nextInt();
        // System.out.println("Your roll no is " + rollno);

        // int a = 10;
        // boolean yash = false;
        // int bignum = 234_000_000;
        // System.out.println(bignum);

        // String name = input.next();
        // System.out.println(name);

        // float marks = input.nextFloat();
        // System.out.println(marks);

        System.out.print("Enter first number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter Second number: ");
        float num2 = input.nextFloat();
        float sum = num1 + num2;
        System.out.println("Sum of numbers: " + sum);

    }
}
