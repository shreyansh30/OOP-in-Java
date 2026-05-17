import java.io.*;
import java.util.Scanner;

public class file_operations2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the source file name: ");
            String sourceFileName = scanner.nextLine();

            System.out.print("Enter the destination file name: ");
            String destinationFileName = scanner.nextLine();

            copyUsingCharacterStream(sourceFileName, destinationFileName);

            copyUsingByteStream(sourceFileName, destinationFileName);
        }

        System.out.println("File Copied");
    }
    public static void copyUsingCharacterStream(String sourceFileName, String destinationFileName) {
        try (FileReader sourceFile = new FileReader(sourceFileName);
             FileWriter destinationFile = new FileWriter(destinationFileName)) {

            int character;
            while ((character = sourceFile.read()) != -1) {
                destinationFile.write(character);
            }

        } catch (IOException e) {
            System.err.println("Error copying file using character stream: " + e.getMessage());
        }
    }
    public static void copyUsingByteStream(String sourceFileName, String destinationFileName) {
        try (FileInputStream sourceFile = new FileInputStream(sourceFileName);
             FileOutputStream destinationFile = new FileOutputStream(destinationFileName)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = sourceFile.read(buffer)) != -1) {
                destinationFile.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.err.println("Error copying file using byte stream: " + e.getMessage());
        }
    }
}