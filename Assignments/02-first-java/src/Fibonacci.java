import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // To calculate Fibonacci Series up to n numbers.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter target: ");
        int target = input.nextInt();
        int count = 2;
        int prev = 0;
        int curr = 1;

        while(count <= target){
            int local = prev + curr;
            prev = curr;
            curr = local;
            count++;
        }
        
        System.out.println("Fibonacci number: " + curr);


    }
}

