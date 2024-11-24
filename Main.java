import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);

            System.out.print("X:");
            int x = input.nextInt();
            System.out.print("Y:");
            int y = input.nextInt();
            System.out.print("N:");

            int n = input.nextInt();

            System.out.print("The gcd is: ");

            System.out.println(gcd.calc_gcd(x, y, n));

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid integer.");

        }         

    }
}