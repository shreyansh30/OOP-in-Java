import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class negativeNumberException {
    public void processInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            try {
                if (number < 0) {
                    throw new NegativeNumberException("number should be positive");
                }
                System.out.println("Double value: " + (number * 2));
            } catch (NegativeNumberException e) {
                System.out.println("Caught the exception");
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }
    }
public static void main(String[] args) {
        negativeNumberException processor = new negativeNumberException();
        processor.processInput();
    }
}


