import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class file_operations3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the name of the first binary file: ");
            String file1 = scanner.nextLine();

            System.out.print("Enter the name of the second binary file: ");
            String file2 = scanner.nextLine();

            compareFiles(file1, file2);
        }
    }

    public static void compareFiles(String file1, String file2) {
        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            int bytePosition = 1;
            while (true) {
                int byte1 = fis1.read();
                int byte2 = fis2.read();

                if (byte1 == -1 && byte2 == -1) {
                    System.out.println("Two files are equal");
                    return;
                }

                if (byte1 != byte2) {
                    System.out.println("Two files are not equal: byte position at which two files differ is " + bytePosition);
                    return;
                }

                bytePosition++;
            }

        } catch (IOException e) {
            System.err.println("Error comparing files: " + e.getMessage());
        }
    }
}
