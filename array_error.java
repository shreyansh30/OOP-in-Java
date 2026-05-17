import java.util.Scanner;

public class array_error {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the array size: ");
            int size = scanner.nextInt();
            int[] array = new int[size];

            System.out.print("Enter the numbers: ");
            for (int i = 0; i <= size; i++) {
                try {
                    array[i] = scanner.nextInt();
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Exception caught: " + e.getMessage());
                    break;
                }
            }
        }
    }
}
