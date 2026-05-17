import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class occurrence {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the list:");
            int n = scanner.nextInt();
            
            int[] numbers = new int[n];
            System.out.println("Enter the elements of the list:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }
            
            Map<Integer, Integer> occurrenceMap = new HashMap<>();
            for (int number : numbers) {
                occurrenceMap.put(number, occurrenceMap.getOrDefault(number, 0) + 1);
            }
            
            System.out.println("Occurrences of each element:");
            for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}