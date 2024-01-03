import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temprature in C: ");
        float temp_in_c = in.nextFloat();

        float temp_in_f = (temp_in_c * 9/5) + 32;

        System.out.print("YOur temprature in F is " + temp_in_f);

    }
}
