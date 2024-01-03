import java.util.Scanner;

public class SimpInterest {
    public static void main(String[] args) {
        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal: ");
        int principal = input.nextInt();

        System.out.print("Enter no of years: ");
        int time = input.nextInt();

        System.out.print("Enter the interest Rate: ");
        float rate_of_interest = input.nextFloat();

        float simpleint = (principal * time * rate_of_interest) / 100;

        System.out.println("The simple interest is: Rs" + simpleint);

    }
}
