import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_operation4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the name of the file: ");
            String fileName = scanner.nextLine();

            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("File not found.");
                return;
            }

            try (Scanner fileScanner = new Scanner(file)) {
                int characters = 0;
                int lines = 0;
                int words = 0;

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    lines++;
                    characters += line.length() + 1; // +1 for newline character
                    words += line.split("\\s+").length;
                }

                System.out.println("No. of characters: " + characters);
                System.out.println("No. of lines: " + lines);
                System.out.println("No. of words: " + words);

            } catch (FileNotFoundException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        }
    }
}
