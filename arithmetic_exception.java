import java.util.Scanner;

public class arithmetic_exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend, divisor, quotient;

        System.out.print("Enter dividend: ");
        dividend = scanner.nextInt();
        System.out.print("Enter divisor: ");
        divisor = scanner.nextInt();

        try {
            quotient = dividend / divisor;
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
            scanner.close();
        }
    }
}
