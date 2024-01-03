import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        // Take 2 numbers as input and print the largest number.

        Scanner input = new Scanner(System.in);

        System.out.print("1st Number: ");
        float num1 = input.nextFloat();

        System.out.print("2nd Number: ");
        float num2 = input.nextFloat();

        if(num1 > num2){
            System.out.println("1st number is bigger");
        }else if(num1 < num2){
            System.out.println("2nd number is bigger");   
        }else{
            System.out.println("Both numbers are equal");   
        }

    }
}
