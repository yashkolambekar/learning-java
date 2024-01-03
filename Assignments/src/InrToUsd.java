import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        // Input currency in rupees and output in USD.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        float rupees = input.nextFloat();

        float usd = (float)(rupees * 0.012);

        System.out.println("Rs." + rupees + " equals to USD " + usd);

    }
}
