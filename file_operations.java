import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class file_operations {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the name of existing file to which student details will be written: ");
            String fileName = scanner.nextLine();

            try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
                while (true) {
                    System.out.print("Enter student roll no (or -1 to stop): ");
                    int rollNo = scanner.nextInt();
                    if (rollNo == -1) {
                        break;
                    }

                    scanner.nextLine(); 
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter subject: ");
                    String subject = scanner.nextLine();

                    System.out.print("Enter marks: ");
                    double marks = scanner.nextDouble();

                    writer.println("Roll No: " + rollNo);
                    writer.println("Name: " + name);
                    writer.println("Subject: " + subject);
                    writer.println("Marks: " + marks);
                    writer.println(); 
                }
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }

            try (Scanner fileScanner = new Scanner(new File(fileName))) {
                System.out.println("Content of file:");
                while (fileScanner.hasNextLine()) {
                    System.out.println(fileScanner.nextLine());
                }
            } catch (IOException e) {
                System.err.println("Error reading from file: " + e.getMessage());
            }
        }
    }
}

