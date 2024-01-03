import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        float num1 = input.nextFloat();

        System.out.print("Enter the operation (+, -, *, /): ");
        String operation = input.next();

        System.out.print("Enter second Number: ");
        float num2 = input.nextFloat();

        double answer = 696.69;

        if(operation.equals("+")){
            answer = num1 + num2;
        }else if(operation.equals("-")){
            answer = num1 - num2;
        }else if(operation.equals("*")){
            answer = num1 * num2;
        }else if(operation.equals("/")){
            answer = num1 / num2;
        }else{
            System.out.println("Invalid operator");
        }

        System.out.println("The answer is: " + answer);
    }
}
