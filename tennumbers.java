import java.util.Scanner;

public class tennumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = new int[10];
            
            System.out.println("Please enter exactly 10 numbers:");
            
            for (int i = 0; i < 10; i++) {
                while (true) {
                    try {
                        numbers[i] = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number, please enter again:");
                    }
                }
            }
            
            int evenCount = 0;
            int oddCount = 0;
            
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            
            System.out.println("Even numbers: " + evenCount);
            System.out.println("Odd numbers: " + oddCount);
        }
    }
}